import java.net. InetAddress;
import java.net.UnknownHostException;

public class Q2FindLocalIPAddress {
public static void main(String[] args) {
try {
// Get the local host
InetAddress localHost = InetAddress.getLocalHost();

// Print the IP address of the local host
System.out.println("Local IP Address: " + localHost.getHostAddress());

// Print the hostname of the local host
System.out.println("Local Host Name: " + localHost.getHostName());
} catch (UnknownHostException e) {
System.err.println("Unable to determine the IP address of the local machine.");
e.printStackTrace();

}

}

}