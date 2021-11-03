import java.rmi.*;

public interface Adder extends Remote {
    public int count(String s) throws RemoteException;
    public String daonguoc(String d) throws RemoteException;
}

 