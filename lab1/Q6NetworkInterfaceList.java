import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Q6NetworkInterfaceList {

    public static void main(String[] args) {

        try {
            Enumeration<NetworkInterface> interfaces =
                    NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements()) {

                NetworkInterface ni = interfaces.nextElement();

                System.out.println("Name: " + ni.getName());
                System.out.println("Display Name: " + ni.getDisplayName());
                System.out.println("Hardware Address: " + getHardwareAddress(ni));
                System.out.println();
            }

        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    private static String getHardwareAddress(NetworkInterface ni)
            throws SocketException {

        byte[] hardwareAddress = ni.getHardwareAddress();

        if (hardwareAddress == null)
            return "N/A";

        StringBuilder sb = new StringBuilder();

        for (byte b : hardwareAddress) {
            sb.append(String.format("%02X:", b));
        }

        return sb.substring(0, sb.length() - 1);
    }
}