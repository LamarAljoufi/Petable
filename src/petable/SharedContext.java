/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petable;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SharedContext {

    private static ServerSocket serverSocket;
    private static Server server;
    private static Socket socket;
    private static ObjectOutputStream outputStream;

    public static ObjectOutputStream getoutputStream() throws IOException {
        if (outputStream == null) {
            outputStream = new ObjectOutputStream(socket.getOutputStream());
        }
        return outputStream;
    }

    public static Socket getSocket() throws IOException {
        if (socket == null) {
            socket = new Socket("127.0.0.1", 8800);
        }
        return socket;
    }

    public static void setServerSocket(ServerSocket socket) {
        serverSocket = socket;
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
