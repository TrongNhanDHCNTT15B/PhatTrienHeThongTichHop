import java.net.MalformedURLException;
import java.rmi.*;
import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    private static final int PORT = 2109;
    private static Registry registry;
    public static void main(String args[]) throws RemoteException {

        try {
            registry = LocateRegistry.createRegistry(PORT);
            AdderImpl adder = new AdderImpl();
            Naming.rebind("adder", adder);
            System.out.println("Server đang chạy");
        } catch (RemoteException re) {
            re.printStackTrace();
        } catch (MalformedURLException me) {
            me.printStackTrace();
        }
    }
}