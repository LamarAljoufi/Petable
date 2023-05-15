/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petable;

/**
 *
 * @author DELL
 */
import java.sql.*;

public class DatabaseConnection {

    static Connection conn = null;

    public DatabaseConnection() {
        
        String url = "jdbc:mysql://localhost:3306/Petable"; // replace with your database URL
        String username = "root"; // replace with your username
        String password = "123Lam@456"; // replace with your password

        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");

            // Step 3: Use the connection to execute SQL queries or other operations
            // ...
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Step 4: Close the connection (if open)
//            if (conn != null) {
//                try {
//                    conn.close();
//                    System.out.println("Connection closed.");
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
        }
    }
    

    public static void main(String[] args) {

    }

    public void addPet(Pet pet) {
        if (pet instanceof Cat) {
            addCat((Cat) pet);
        } else if (pet instanceof Dog) {
            addDog((Dog) pet);
        } else {
            System.out.println("Invalid pet type.");
        }
    }

    private void addCat(Cat cat) {
        
        try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO Pets (HealthStatus, Gender, Age, Name, Species, IsAdopted) "
                    + "VALUES (" + cat.getHealthStatus() + ", '" + cat.getGender() + "', "
                    + cat.getAge() + ", '" + cat.getName() + "', 'Cat', "
                    + cat.isIsAdopted() + ")";
            stmt.executeUpdate(sql);
            System.out.println("New cat added to the database.");
        } catch (SQLException e) {
            System.out.println("Error adding cat to the database: " + e.getMessage());
        }
    
    }
    
    private void addDog(Dog dog) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO Pets (HealthStatus, Gender, Age, Name, Species, IsAdopted) "
                    + "VALUES (" + dog.getHealthStatus() + ", '" + dog.getGender() + "', "
                    + dog.getAge() + ", '" + dog.getName() + "', 'Dog', "
                    + dog.isIsAdopted() + ")";
            stmt.executeUpdate(sql);
            System.out.println("New dog added to the database.");
        } catch (SQLException e) {
            System.out.println("Error adding dog to the database: " + e.getMessage());
        }
    }
}
