//1) Write a program that splits the parts of a URL.

import java.net.*;

public class Q1URLSplitter {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.abhinavsapkota.com.np:8080/path/page.html?id=10#section");

            System.out.println("The URL is " + u);
            System.out.println("The protocol is " + u.getProtocol());
            System.out.println("The host is " + u.getHost());
            System.out.println("The port is " + u.getPort());
            System.out.println("The path is " + u.getPath());
            System.out.println("The ref is " + u.getRef());
            System.out.println("The query string is " + u.getQuery());

        } catch (MalformedURLException e) {
            System.err.println(e);
        }
    }
}