//4) Write a program for resolving relative URI.

import java.net.*;

public class Q4ResolveRelativeURI {
    public static void main(String[] args) {
        try {
            URI absolute = new URI("http://www.example.com/");
            URI relative = new URI("images/logo.png");

            URI resolved = absolute.resolve(relative);

            System.out.println("Absolute URI: " + absolute);
            System.out.println("Relative URI: " + relative);
            System.out.println("Resolved URI: " + resolved);

        } catch (URISyntaxException e) {
            System.err.println(e);
        }
    }
}