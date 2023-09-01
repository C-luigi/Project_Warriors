package fr.cnalps.pw.database;

import java.lang.reflect.Constructor;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

import fr.cnalps.pw.boardgame.crate.DefaultFist;
import fr.cnalps.pw.boardgame.crate.Equipment;
import fr.cnalps.pw.character.Character;
import fr.cnalps.pw.exception.DatabaseException;

public class HeroDatabase {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_projectwarriors";
    private static final String JDBC_USER = "Cluigi";
    private static final String JDBC_PASSWORD = "0601";
    private static HeroDatabase instance;  // Instance Singleton
    private static Connection connection;         // Connexion à la base de données

    // Constructeur privé pour empêcher l'instanciation de plusieurs fr.campusnumerique.pw.database.HeroDatabase
    private HeroDatabase() throws DatabaseException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (Exception e) {
            throw new DatabaseException("Error initializing the database connection", e);
        }
    }

    // Méthode pour obtenir l'instance Singleton de fr.campusnumerique.pw.database.HeroDatabase
    public static HeroDatabase getInstance() throws DatabaseException {
        if (instance == null) {
            instance = new HeroDatabase();
        }
        return instance;
    }

    public List<Character> getHeroes() throws DatabaseException {
        List<Character> characterList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM hero");

            while (resultSet.next()) {
                Character character = null;
                String type = resultSet.getString("type");
                String name = resultSet.getString("name");
                int healthPoints = resultSet.getInt("healthPoints");
                int strongPoints = resultSet.getInt("strongPoints");

                Class<?> characterClass = Class.forName("fr.cnalps.pw.character." + type);
                Constructor<?> constructor = characterClass.getConstructor(String.class, int.class, int.class, Equipment.class);
                character = (Character) constructor.newInstance(name, healthPoints, strongPoints, new DefaultFist());
                characterList.add(character);
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            throw new DatabaseException("Error fetching heroes from database", e);
        }
        return characterList;
    }

    /**
     * Méthode pour fermer la connexion lorsqu'elle n'est plus nécessaire
     * @throws DatabaseException
     */
    public static void closeConnection() throws DatabaseException {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error closing the database connection", e);
        }
    }
}