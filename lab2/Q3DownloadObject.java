//3) Write a program to download an object.

import java.io.*;
import java.net.*;

public class Q3DownloadObject {
    public static void main(String[] args) {
        String address = "https://www.example.com/image.jpg";
        String fileName = "downloaded.jpg";

        try {
            URL u = new URL(address);

            InputStream in = u.openStream();
            FileOutputStream out = new FileOutputStream(fileName);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            in.close();
            out.close();

            System.out.println("File downloaded successfully.");

        } catch (MalformedURLException e) {
            System.err.println("Invalid URL: " + address);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}