/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petable;

/**
 *
 * @author DELL
 */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Server {

    private static DatabaseConnection DB = new DatabaseConnection();

    private static final int port = 8800;

    private boolean isRunning;
    static String receive;
    static ObjectInputStream inputStream;

    public static void main(String[] args) throws IOException, SQLException, InterruptedException {
        Server server = SharedContext.getServer();
        ServerSocket serverSocket = new ServerSocket(port);
        SharedContext.setServerSocket(serverSocket);

        // Continuously listen for client connections
        while (true) {
            Socket clientSocket = serverSocket.accept();

            // Handle the client connection in a separate thread
            Thread userThread = new Thread(() -> {
                try {
                    // Create an ObjectInputStream to receive objects from the client
                    inputStream = new ObjectInputStream(clientSocket.getInputStream());
                    // Read the serialized object from the client
                    receive = inputStream.readUTF();
                    System.out.println(receive);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            userThread.start();
            userThread.join();

            Thread clientThread = new Thread(() -> {
                try {
                    ObjectOutputStream outputStream = new ObjectOutputStream(clientSocket.getOutputStream());
                    outputStream.writeUTF(DB.readBasedOnKey(receive));

                    File file = new File("Output.txt");
                    if (file.length() != 0) {
                        inputStream.close();
                        outputStream.close();
                        clientSocket.close();

                    }
                } catch (IOException | SQLException e) {
                    e.printStackTrace();
                }

            });
            clientThread.start();
        }
    }
}
