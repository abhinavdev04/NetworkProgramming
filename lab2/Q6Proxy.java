//6) Write a program to demonstrate the Proxy class and ProxySelector class.

import java.net.*;
import java.util.*;

public class Q6Proxy {
    public static void main(String[] args) {
        try {
            SocketAddress address = new InetSocketAddress("proxy.example.com", 8000);

            Proxy proxy = new Proxy(Proxy.Type.HTTP, address);

            System.out.println("Proxy Type: " + proxy.type());
            System.out.println("Proxy Address: " + proxy.address());

            ProxySelector selector = ProxySelector.getDefault();

            URI uri = new URI("http://www.example.com");

            List<Proxy> proxies = selector.select(uri);

            System.out.println("Proxy Selector Result: " + proxies);

        } catch (URISyntaxException e) {
            System.err.println(e);
        }
    }
}