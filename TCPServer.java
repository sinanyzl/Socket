import java.net.*;
import java.io.IOException;

public class TCPServer {
  public static void main(String[] args) throws IOException {
  
  
  
    ServerSocket serverSocket = new ServerSocket(5001);
    System.out.println("Listening for clients...");
    Socket clientSocket = serverSocket.accept();
    String clientSocketIP = clientSocket.getInetAddress().toString();
    int clientSocketPort = clientSocket.getPort();
    System.out.println("[IP: " + clientSocketIP + " ,Port: " + clientSocketPort +"]  " + "Client Connection Successful!");
  }
}