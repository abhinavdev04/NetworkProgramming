import java.net.InetAddress;
import java.net.UnknownHostException;

public class Q4DomainNameVerifier {
    public static void main(String[] args) {
        String domain1 = "www.ibiblio.org";
        String domain2 = "helios.ibiblio.org";

        try {
            InetAddress address1 = InetAddress.getByName(domain1);
            InetAddress address2 = InetAddress.getByName(domain2);

            System.out.println("IP Address of " + domain1 + ": " + address1.getHostAddress());
            System.out.println("IP Address of " + domain2 + ": " + address2.getHostAddress());

            if (address1.equals(address2)) {
                System.out.println("The two domains resolve to the same IP address.");
            } else {
                System.out.println("The two domains do not resolve to the same IP address.");
            }

        } catch (UnknownHostException e) {
            System.err.println("Unable to resolve one or both of the domain names.");
            e.printStackTrace();
        }
    }
}