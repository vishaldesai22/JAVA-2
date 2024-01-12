import java.net.url;
import java.net.MalformedURLException;

public class url {
    public static void main(String args[]) throws MalformedURLException {
        URL u = new URL("https://google.com/");
        System.out.println("Authority:" + getAuthority());
        System.out.println("default port" + getDefaultPort());
        System.out.println("file" + getFile);
        System.out.println("Path" + getPath());
        System.out.println("protocol " + getProtocol());
        System.out.println("reference" + getRef());

    }

}
