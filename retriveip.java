import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class retriveip
{public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
System.out.println("enter host name");
String host=sc.nextLine();
try{
InetAddress ip = InetAddress.getByName(host);
System.out.println("ip address is "+ip.getHostAddress());

}
catch(UnknownHostException e)
{
System.out.println(e);
}
}
}