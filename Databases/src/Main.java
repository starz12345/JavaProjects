import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection save = DriverManager.getConnection("jdbc:sqlite:/Users/victoray/Downloads/JavaProjects/Databases/testjava.db");
            Statement statement = save.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS contacts(name TEXT, phone INTEGER, email TEXT)");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM contacts");

            while (resultSet.next()){
                System.out.print(resultSet.getString("name")  + " ");
                System.out.print(resultSet.getInt("phone") + " ");
                System.out.print(resultSet.getString("email") + " ");
            }

            resultSet.close();
            statement.close();
            save.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
