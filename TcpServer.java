
//import java.net.*;
import java.net.Socket; //for class Socket 
import java.net.ServerSocket; //for class ServerSocket 
import java.io.OutputStream; //for OutputStream
 
public class TcpServer {
    public static int port = 20;
 
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(port);
        while (true) {
            Socket sc = ss.accept();
            OutputStream os = sc.getOutputStream();
            os.write("From Server : Hi !".getBytes("UTF-8"));
            os.close();
            sc.close();
        }
    }
}