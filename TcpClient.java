
/*
//import the whole package(?)
import java.net.*; //for class Socket 
import java.io.*; //for InputStream
*/
import java.net.Socket; //for class Socket 
import java.io.InputStream; //for InputStream


public class TcpClient {
    public static int port = 20;
 
    public static void main(String args[]) throws Exception {
        Socket client = new Socket(args[0], port);    
        InputStream in = client.getInputStream();
        StringBuffer buf = new StringBuffer();
        try {
            while (true) { 
                int x = in.read();
                if (x==-1) break;
                byte b = (byte) x;
                buf.append((char) b);
            }
        } catch (Exception e) {
            in.close();
        }
        System.out.println(buf);
        client.close();
    }
}