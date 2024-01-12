import java.net.URL;
import java.net.MalformedURLException;
public class urlretrive
{
public static void main(String args[]) throws MalformedURLException
{
URL url = new URL("https://msbte.org.in/");
System.out.println("authority" + url.getAuthority());
System.out.println("default port"+url.getDefaultPort() );
System.out.println("file" + url.getFile() );
System.out.println("path" + url.getPath());
System.out.println("protocol" + url.getProtocol());
System.out.println("reference" + url.getRef());

}
}