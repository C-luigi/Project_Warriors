import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.campusnumerique.pw.character.Character;
import fr.campusnumerique.pw.character.Magician;
import fr.campusnumerique.pw.character.Warrior;

public class HeroDatabase {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_projectwarriors";
    private static final String JDBC_USER = "cluigi";
    private static final String JDBC_PASSWORD = "0601";

    public static ArrayList<Character> getHeroes() {
        ArrayList<Character> characterList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

//            Driver pilote = new Driver();
//            // enregistrement du pilote auprès du DriverManager
//            DriverManager.registerDriver(pilote);Q

            // Établir la connexion à la base de données
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Créer une déclaration SQL
            Statement statement = connection.createStatement();

            // Exécute la requête SQL pour récupérer la liste des héros
            ResultSet resultSet = statement.executeQuery("SELECT * FROM hero");

//            // Parcourir les résultats et afficher les informations des héros
            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String type = resultSet.getString("type");
                if (type.equals("Warrior")){
                    String name = resultSet.getString("name");
                    int healthPoints = resultSet.getInt("healthPoints");
                    int strongPoints = resultSet.getInt("strongPoints");
                    Warrior warrior = new Warrior(name,healthPoints,strongPoints,null);
                    characterList.add(warrior);
                }
                if (type.equals("Magician")){
                    String name = resultSet.getString("name");
                    int healthPoints = resultSet.getInt("healthPoints");
                    int strongPoints = resultSet.getInt("strongPoints");
                    Magician magician = new Magician(name,healthPoints,strongPoints,null);
                    characterList.add(magician);
                }
            }
            // Fermer les ressources
            resultSet.close();
            statement.close();
            connection.close();
            return characterList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return characterList;
    }
}