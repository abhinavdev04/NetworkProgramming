// 5) Write a program to check remote system is reachable or not? [Testing Reachability]

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;

public class Q5ReachabilityCheck {

    public static void main(String[] args) {

        String remoteIPAddress = "8.8.8.8";

        int timeout = 5000; 

        try {

            InetAddress remoteAddress = InetAddress.getByName(remoteIPAddress);

            if (remoteAddress.isReachable(timeout)) {

                System.out.println("The remote system " + remoteIPAddress + " is reachable.");

            } else {

                System.out.println("The remote system " + remoteIPAddress + " is not reachable.");
            }

        } catch (UnknownHostException e) {

            System.err.println("Unable to resolve the IP address: " + remoteIPAddress);
            e.printStackTrace();

        } catch (IOException e) {

            System.err.println("Network error occurred while trying to reach " + remoteIPAddress);
            e.printStackTrace();
        }
    }
}