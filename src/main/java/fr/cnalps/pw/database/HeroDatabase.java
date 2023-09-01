package fr.cnalps.pw.database;

import java.lang.reflect.Constructor;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

import fr.cnalps.pw.boardgame.crate.DefaultFist;
import fr.cnalps.pw.boardgame.crate.equipment.Equipment;
import fr.cnalps.pw.character.Character;
import fr.cnalps.pw.exception.DatabaseException;

/**
 * This class manages database connections, fetches hero data, and closes the connection when done.
 * Singleton implementation for database operations related to hero entities.
 */

public class HeroDatabase {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_projectwarriors";
    private static final String JDBC_USER = "Cluigi";
    private static final String JDBC_PASSWORD = "0601";
    private static HeroDatabase instance;  // Instance Singleton
    private static Connection connection;         // Connexion à la base de données

    // Constructeur privé pour empêcher l'instanciation de plusieurs fr.campusnumerique.pw.database.HeroDatabase

    /**
     * Private constructor to prevent multiple instances.
     * Establishes a connection with the database.
     *
     * @throws DatabaseException If there's an error during the database connection initialization.
     */

    private HeroDatabase() throws DatabaseException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (Exception e) {
            throw new DatabaseException("Error initializing the database connection", e);
        }
    }

    // Méthode pour obtenir l'instance Singleton de fr.campusnumerique.pw.database.HeroDatabase

    /**
     * Provides access to HeroDatabase.
     *
     * @return The single instance of HeroDatabase.
     * @throws DatabaseException If there's an error initializing the database connection.
     */

    public static HeroDatabase getInstance() throws DatabaseException {
        if (instance == null) {
            instance = new HeroDatabase();
        }
        return instance;
    }

    /**
     * Generate a list of hero characters from the database.
     *
     * @return A list of hero characters.
     * @throws DatabaseException If there's an error fetching heroes from the database.
     */

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
     * Closes the database connection when it's no longer needed.
     *
     * @throws DatabaseException If there's an error while trying to close the database connection.
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