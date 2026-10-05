//5) Write a program that communicate with Server-Side-Programs Through GET.

import java.io.*;
import java.net.*;

public class Q5GETRequest {
    public static void main(String[] args) {
        try {
            String search = URLEncoder.encode("java", "UTF-8");

            URL u = new URL("https://www.google.com/search?q=" + search);

            InputStream in = new BufferedInputStream(u.openStream());
            Reader r = new InputStreamReader(in);

            int c;

            while ((c = r.read()) != -1) {
                System.out.print((char) c);
            }

            r.close();

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}