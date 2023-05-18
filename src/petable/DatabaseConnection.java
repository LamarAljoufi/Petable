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
    public String phoneNo;
    public int lastRetrievedRowId = -1;

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

//    public void addPet(Pet pet) {
//        if (pet instanceof Cat) {
//            addCat((Cat) pet);
//        } else if (pet instanceof Dog) {
//            addDog((Dog) pet);
//        } else {
//            System.out.println("Invalid pet type.");
//        }
//    }
    public void addCat(Cat cat) {

        try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO Pets (ID,HealthStatus, Gender, Age, Name, Species, IsAdopted,OwnerPhone) "
                    + "VALUES (" + cat.getID() + ", " + cat.getHealthStatus() + ", '" + cat.getGender() + "', "
                    + cat.getAge() + ", '" + cat.getName() + "', 'Cat', "
                    + cat.isIsAdopted() + ", '" + phoneNo + "');";

            stmt.executeUpdate(sql);
            System.out.println("New cat added to the database.");
        } catch (SQLException e) {
            System.out.println("Error adding cat to the database: " + e.getMessage());
        }

    }

    public void addDog(Dog dog) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO Pets (ID,HealthStatus, Gender, Age, Name, Species, IsAdopted,OwnerPhone) "
                    + "VALUES (" + dog.getID() + ", " + dog.getHealthStatus() + ", '" + dog.getGender() + "', "
                    + dog.getAge() + ", '" + dog.getName() + "', 'Dog', "
                    + dog.isIsAdopted() + ", '" + phoneNo + "')";
            stmt.executeUpdate(sql);
            System.out.println("New dog added to the database.");
        } catch (SQLException e) {
            System.out.println("Error adding dog to the database: " + e.getMessage());
        }
    }

    public void addUser(User user) {

        try {
            Statement stmt = conn.createStatement();
            phoneNo = user.getPhoneNo();
            String sql = "INSERT INTO User(Phone, Name, Age)"
                    + "VALUES ('" + phoneNo + "' , '" + user.getName() + "' ," + user.getAge() + ");";

            stmt.executeUpdate(sql);
            System.out.println("New User added to the database.");
        } catch (SQLException e) {
            System.out.println("Error adding User to the database: " + e.getMessage());
        }

    }

    public String retCat() throws Exception {

        String sql;
        Statement stmt = conn.createStatement();
        ResultSet rs;

        if (lastRetrievedRowId == -1) {
            sql = "SELECT * FROM Pets";
            rs = stmt.executeQuery(sql);
        } else {
            sql = "SELECT * FROM Pets WHERE ID > ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, lastRetrievedRowId);
            rs = pstmt.executeQuery();
        }
        String result = null;
        while (rs.next() && result == null) {

            boolean isAdopted = rs.getBoolean("IsAdopted");
            String species = rs.getString("Species");
            // Process the results

            if (isAdopted == false && species.equalsIgnoreCase("Cat")) {
                // Retrieve the data from the current row
                int id = rs.getInt("ID");
                boolean hs = rs.getBoolean("HealthStatus");
                String gender = rs.getString("Gender");
                int age = rs.getInt("Age");
                String name = rs.getString("Name");

                lastRetrievedRowId = id; // Update the last retrieved row ID

                result = "<html>Pet's ID: " + id + "<br>"
                        + "Pet name: " + name + "<br>"
                        + "Pet's Age: " + age + "<br>"
                        + "Pet's gender: " + gender + "<br>"
                        + "HealthStatus: " + (hs ? "Healthy" : "UnHealthy") + "</html>";

                rs.close();
                stmt.close();
                return result;

            }
            isAdopted = rs.getBoolean("IsAdopted");
            species = rs.getString("Species");

        }

        return null; // Return null if no more rows are available
    }

    public String retDog() throws Exception {

        String sql;
        Statement stmt = conn.createStatement();
        ResultSet rs;

        if (lastRetrievedRowId == -1) {
            sql = "SELECT * FROM Pets";
            rs = stmt.executeQuery(sql);
        } else {
            sql = "SELECT * FROM Pets WHERE ID > ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, lastRetrievedRowId);
            rs = pstmt.executeQuery();
        }
        String result = null;
        while (rs.next() && result == null) {

            boolean isAdopted = rs.getBoolean("IsAdopted");
            String species = rs.getString("Species");
            // Process the results

            if (isAdopted == false && species.equalsIgnoreCase("Dog")) {
                // Retrieve the data from the current row
                int id = rs.getInt("ID");
                boolean hs = rs.getBoolean("HealthStatus");
                String gender = rs.getString("Gender");
                int age = rs.getInt("Age");
                String name = rs.getString("Name");

                lastRetrievedRowId = id; // Update the last retrieved row ID

                result = "<html>Pet's ID: " + id + "<br>"
                        + "Pet name: " + name + "<br>"
                        + "Pet's Age: " + age + "<br>"
                        + "Pet's gender: " + gender + "<br>"
                        + "HealthStatus: " + (hs ? "Healthy" : "UnHealthy") + "</html>";

                rs.close();
                stmt.close();
                return result;

            }
            isAdopted = rs.getBoolean("IsAdopted");
            species = rs.getString("Species");

        }

        return null; // Return null if no more rows are available
    }

    public void updateIsadopted(int ID) throws SQLException {

        String sql = "UPDATE pets SET IsAdopted = ? WHERE ID = ?";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            // Set the parameter values
            preparedStatement.setBoolean(1, true);
            preparedStatement.setInt(2, ID);

            // Execute the update statement
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated");
        }

    }

}
