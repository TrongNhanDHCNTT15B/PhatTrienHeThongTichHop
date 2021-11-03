import java.net.MalformedURLException;
import java.rmi.*;


public class RMIServer {
    public static void main(String args[]) {

        try {
            AdderImpl adder = new AdderImpl();
            Naming.rebind("adder", adder);
            System.out.println("Server dang chay");
        } catch (RemoteException re) {
            re.printStackTrace();
        } catch (MalformedURLException me) {
            me.printStackTrace();
        }
    }
}
