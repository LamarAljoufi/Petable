/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petable;

import java.sql.*;
import java.time.LocalDate;

public class DatabaseConnection {

    static Connection conn = null;
    public String phoneNo;
    public int lastRetrievedRowId = -1;

    public DatabaseConnection() {

        String url = "jdbc:mysql://localhost:3306/Petable";
        String username = "root";
        String password = "123Lam@456";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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

    public String retPet(String sp) throws Exception {
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

            if (isAdopted == false && species.equalsIgnoreCase(sp)) {
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
        return null;
    }

    public void updateIsadopted(int ID) throws SQLException {

        String sql = "UPDATE pets SET IsAdopted = ? WHERE ID = ?";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setBoolean(1, true);
            preparedStatement.setInt(2, ID);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated");
        }

    }

    public String readBasedOnKey(String receive, int receive2) throws SQLException {

        String result = null;
        String sql1 = "Select * From User Where Phone = '" + receive + "';";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql1);
        String Phone = null;
        String Uname = null;
        while (rs.next()) {
            Phone = rs.getString("Phone");
            Uname = rs.getString("Name");
        }
        result = "\t\tThanks for using petable here is information details\n\n";
        LocalDate currentDate = LocalDate.now();
        result += "\t\tInvoce ID: #" + (int) (Math.random() * 999) + "\t\t\tDate:" + currentDate + "\n";
        result += "\n\n\t\t--------------User information--------------\n"
                + "\t\tUser's Name: " + Uname + "\n"
                + "\t\tUser's Phone: " + receive + "\n";

        String sql2 = "Select * From Pets Where ID = " + receive2;
        ResultSet rs2 = stmt.executeQuery(sql2);
        int id = 0;
        boolean hs = false;
        String gender = null;
        int age = 0;
        String Pname = null;
        String species = null;
        while (rs2.next()) {
            id = rs2.getInt("ID");
            hs = rs2.getBoolean("HealthStatus");
            gender = rs2.getString("Gender");
            age = rs2.getInt("Age");
            Pname = rs2.getString("Name");
            species = rs2.getString("Species");
        }

        result += "\n\n\t\t--------------Pets information--------------\n";
        result += "\t\tPet's ID: " + id + "\n"
                + "\t\tPet name: " + Pname + "\n"
                + "\t\tPet's Age: " + age + "\n"
                + "\t\tPet's gender: " + gender + "\n"
                + "\t\tHealthStatus: " + (hs ? "Healthy" : "UnHealthy") + "\n"
                + "\t\tSpecies: " + species + "\n";

        result += "\n\n\t\t--------------------------------------------\n";
        result += "\t\t                 BY PETABLE                 ";

        rs.close();
        rs2.close();
        stmt.close();
        return result;
    }

}
