import java.sql.*;
import java.util.List;
import java.util.ArrayList;

import fr.campusnumerique.pw.boardgame.crate.DefaultFist;
import fr.campusnumerique.pw.character.Character;
import fr.campusnumerique.pw.character.Magician;
import fr.campusnumerique.pw.character.Warrior;

public class HeroDatabase {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_projectwarriors";
    private static final String JDBC_USER = "Cluigi";
    private static final String JDBC_PASSWORD = "0601";
    private static HeroDatabase instance;  // Instance Singleton
    private Connection connection;         // Connexion à la base de données

    // Constructeur privé pour empêcher l'instanciation de plusieurs HeroDatabase
    private HeroDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Méthode pour obtenir l'instance Singleton de HeroDatabase
    public static synchronized HeroDatabase getInstance() {
        if (instance == null) {
            instance = new HeroDatabase();
        }
        return instance;
    }

    public List<Character> getHeroes() {
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

                if (type.equals("Warrior")) {
                    character = new Warrior(name, healthPoints, strongPoints, new DefaultFist());
                }
                if (type.equals("Magician")) {
                    character = new Magician(name, healthPoints, strongPoints, new DefaultFist());
                }
                characterList.add(character);
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return characterList;
    }

    // Méthode pour fermer la connexion lorsqu'elle n'est plus nécessaire
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}