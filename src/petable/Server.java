/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petable;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    private static DatabaseConnection DB = new DatabaseConnection();
    private static final int PORT = 8800;
    static String receive;
    static int receive2;
    static ObjectInputStream inputStream;

    public static void main(String[] args) throws IOException, SQLException, InterruptedException {
        Server server = SharedContext.getServer();
        ServerSocket serverSocket = new ServerSocket(PORT);
        SharedContext.setServerSocket(serverSocket);
        while (true) {
            Socket clientSocket = serverSocket.accept();
            //----userThread----
            Thread userThread = new Thread(() -> {
                try {
                    inputStream = SharedContext.setObjectInputStream(clientSocket);
                    receive = inputStream.readUTF();
                    System.out.println(receive);
                    Thread.sleep(3000);
                    receive2 = inputStream.readInt();
                    System.out.println(receive2);

                } catch (IOException e) {
                    e.printStackTrace();
                } catch (Exception ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }

            });
            //----clientThread----
            Thread clientThread = new Thread(() -> {

                try {
                    PrintWriter writer = new PrintWriter("Output.txt");
                    writer.println(DB.readBasedOnKey(receive, receive2));
                    writer.flush();
                } catch (IOException | SQLException e) {
                    e.printStackTrace();
                }
            });
            //----------------
            userThread.start();
            userThread.join();
            clientThread.start();
        }

    }
}
