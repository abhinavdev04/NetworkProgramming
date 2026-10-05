//2) Write a program to download a web page of a given web address.

import java.io.*;
import java.net.*;

public class Q2DownloadWebPage {
    public static void main(String[] args) {
        String address = "https://abhinavsapkota.com.np/";

        try {
            URL u = new URL(address);

            InputStream in = new BufferedInputStream(u.openStream());
            Reader r = new InputStreamReader(in);

            int c;

            while ((c = r.read()) != -1) {
                System.out.print((char) c);
            }

            r.close();

        } catch (MalformedURLException e) {
            System.err.println(address + " is not a valid URL");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}