import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class AdderImpl extends UnicastRemoteObject implements Adder
{
    public AdderImpl() throws RemoteException{
    }
    public int count(String s) throws RemoteException{
            int i = 0, count = 1;
            char[] s1 = s.toCharArray();
            while(s1[i] == ' ')
            {
                i++;
            }
            for (int j = i; j < s1.length - 1; j++)
            {
                if(s1[j] == ' ' && s1[j + 1] != ' ')
                {
                    count++;
                }
            }
            return count;
        }
    public String daonguoc(String d){
        String reverse = new StringBuffer(d).
                reverse().toString();
        return reverse;
        }
    }