import java.io.*;
import java.net.*;
import java.sql.Timestamp;

public class UDPServer {
  public static void main(String[] args) throws IOException {
	  
    DatagramSocket serverSocket = new DatagramSocket(Integer.parseInt("5001"));
    System.out.println("Server Started. Listening for Clients on port 5001" + "...");
  
    byte[] receiveData = new byte[1024];
    DatagramPacket receivePacket;
    while (true) {
    
       receivePacket = new DatagramPacket(receiveData, receiveData.length);
       serverSocket.receive(receivePacket);
     
      InetAddress IPAddress = receivePacket.getAddress();
      int port = receivePacket.getPort();
   
      String clientMessage = new String(receivePacket.getData(),0,receivePacket.getLength());
   
      Timestamp timestamp = new Timestamp(System.currentTimeMillis());
      System.out.println("[" + timestamp.toString() + " ,IP: " + IPAddress + " ,Port: " + port +"]  " + clientMessage);
    }
  }
}