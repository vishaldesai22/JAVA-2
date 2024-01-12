import java.io.*;
import java.net.*;

public class inetdemo {
    public static void main(String args[]) {
        try {
            InetAddress a = InetAddress.getByName("www.javatpoint.com");
            System.out.println("Hostname:" + a.getHostName());
            System.out.println("HostAddress:" + a.getHostAddress());
            System.out.println("hash code:" + a.hashCode());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
