import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.PublicKey;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Scanner inputobj;
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);
            System.out.print("Enter a string: ");
            inputobj = new Scanner(System.in);
            while (true){
                String inp = inputobj.nextLine();
                printWriter.println(inp);
            }


//            System.out.println("Client Connected.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}