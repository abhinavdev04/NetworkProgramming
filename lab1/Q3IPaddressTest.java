//3) Write a program for determining whether an IP address is IPv4 or IPv6

import java.net.UnknownHostException;
import java.net.InetAddress;

public class Q3IPaddressTest {
    public static void main(String[] args) {

        String ipAddress = "FF00::1";

        try {
            InetAddress address = InetAddress.getByName(ipAddress);

            if (address instanceof java.net.Inet4Address) {
                System.out.println(ipAddress + " is an IPv4 address.");
            } else if (address instanceof java.net.Inet6Address) {
                System.out.println(ipAddress + " is an IPv6 address.");
            } else {
                System.out.println(ipAddress + " is not a valid IP address.");
            }

        } catch (UnknownHostException e) {
            System.err.println("Unable to resolve the IP address: " + ipAddress);
            e.printStackTrace();
        }
    }
}