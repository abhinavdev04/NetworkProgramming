import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindHostname {
    public static void main(String[] args) {
        String ipAddress = "8.8.8.8";

        try {
            InetAddress ia = InetAddress.getByName(ipAddress);

            System.out.println("Canonical Host Name for " + ipAddress + ": "
                    + ia.getCanonicalHostName());

        } catch (UnknownHostException e) {
            System.err.println("Unable to find hostname for the given IP address: "
                    + ipAddress);
            e.printStackTrace();
        }
    }
}