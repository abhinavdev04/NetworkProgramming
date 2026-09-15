//2) Write a program to find the IP address of local host machine.

import java.net. InetAddress;
import java.net.UnknownHostException;

public class Q2FindLocalIPAddress {
public static void main(String[] args) {
try {

InetAddress localHost = InetAddress.getLocalHost();


System.out.println("Local IP Address: " + localHost.getHostAddress());


System.out.println("Local Host Name: " + localHost.getHostName());
} catch (UnknownHostException e) {
System.err.println("Unable to determine the IP address of the local machine.");
e.printStackTrace();

}

}

}