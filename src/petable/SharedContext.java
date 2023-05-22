/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petable;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author DELL
 */
public class SharedContext {

    private static ServerSocket serverSocket;

    private static Server server;

    private static Socket socket;

    public static void setServerSocket(ServerSocket socket) {
        serverSocket = socket;
    }

    public static Socket getSocket() {
        return socket;
    }

    public static void setSocket(Socket socket) {
        SharedContext.socket = socket;
    }

    public static ServerSocket getServerSocket() {
        return serverSocket;
    }

    public static Server getServer() {
        if (server == null) {
            server = new Server();
        }
        return server;
    }
}
