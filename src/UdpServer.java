import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpServer {

    public void receiveAndSendMessage() throws IOException {
        //open the socket
        DatagramSocket serverSocket = new DatagramSocket();
        serverSocket = new DatagramSocket(8769);
        byte[] recvBuffer = new byte[1024];

        //receiving the message
        while (true) {

            DatagramPacket receivedPacket = new DatagramPacket(recvBuffer, recvBuffer.length);
            serverSocket.receive(receivedPacket);

            //reading the message
            String clientMesssage = new String(recvBuffer, 0, receivedPacket.getLength());

            //comparing the message
            if (clientMesssage.equals("HIT ME")) {
                String data = "Keep going, tomorrow will be worse!";

                //writing the letter
                byte[] sendBuffer = data.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(
                        sendBuffer,
                        sendBuffer.length,
                        InetAddress.getByName("127.0.0.1"), receivedPacket.getPort());

                //sending the letter
                serverSocket.send(sendPacket);

                //printing the message
                System.out.println(serverSocket);

                //closing the socket
                //serverSocket.close();
            }
        }
    }
}

