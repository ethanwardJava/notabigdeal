package SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void start(final int portNumber) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(portNumber) /*Listens on port 5000*/){
            Socket client = serverSocket.accept(); // Client connection
            var clientIp = client.getInetAddress().getHostAddress();
            var clientPort = client.getPort();
            var clientInput = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
        }
    }
}
