import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class RMIClient {


    public static void main(String args[]) {

        try {
            Adder a = (Adder) Naming.lookup("rmi://localhost/adder");
            int select;
            Scanner scanner = new Scanner(System.in);
            for (;;) {
                System.out.println("----------MENU----------");
                System.out.println("1. Dem so luong tu tchuoichuoi");
                System.out.println("2. Dao chuoi");
                System.out.println("Nhap exit trong chuc nang bat ki de thoat");
                Scanner sccc = new Scanner(System.in);
                System.out.print("Chon chuc nang: ");
                select = sccc.nextInt();
                switch (select) {
                    case 1:
                        String v;
                        Scanner sc = new Scanner(System.in);
                        System.out.println("----------------------");
                        System.out.println("Chuc nang 1 dang chay");
                        System.out.print("Nhap vao chuoi: ");
                        v = sc.nextLine();
                        String ex = "exit";
                        if(v.equals(ex)==true){
                            System.out.println("Ban chon thoat");
                            System.exit(0);
                        } else {
                            int dem = a.count(v);
                            System.out.println("Chuoi da nhap: " + v);
                            System.out.println("So luong tu trong chuoi: " + dem);
                        }
                        break;
                    case 2:
                        String k;
                        Scanner scc = new Scanner(System.in);
                        System.out.println("----------------------");
                        System.out.println("Chuc nang 2 dang chay");
                        System.out.print("Nhap vao chuoi: ");
                        k = scc.nextLine();
                        String exx = "exit";
                        if(k.equals(exx)==true){
                            System.out.println("Ban chon thoat");
                            System.exit(0);
                        } else {
                            String p = a.daonguoc(k);
                            System.out.println("Chuoi sau khi dao: " + p);
                        }
                        break;
                    default:
                        System.out.println("Khong co chuc nang tuong ung. Nhap lai");
                        break;
                }
            }
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
