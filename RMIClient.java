import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
private static final String HOST = "localhost";
private static final int PORT = 2109;
private static Registry registry;


    public static void main(String args[]) throws Exception {

        try {
            registry = LocateRegistry.getRegistry(HOST, PORT);
            Adder a = (Adder) Naming.lookup("rmi://localhost/adder");
            int select;
            Scanner scanner = new Scanner(System.in);
            for (;;) {
                System.out.println("----------MENU----------");
                System.out.println("1. Đếm số lượng từ");
                System.out.println("2. Đảo chuỗi");
                System.out.println("Nhập exit trong chức năng đang chọn để thoát");

                Scanner sccc = new Scanner(System.in);
                System.out.print("Chọn chức năng: ");
                select = sccc.nextInt();
                switch (select) {
                    case 1:
                        String v;
                        Scanner sc = new Scanner(System.in);
                        System.out.println("----------------------");
                        System.out.println("Chức năng 1 đang chạy");
                        System.out.print("Nhập vào chuỗi: ");
                        v = sc.nextLine();
                        String ex = "exit";
                        if(v.equals(ex)==true){
                            System.out.println("Bạn chọn thoát chương trình. Tạm biệt!");
                            System.exit(0);
                        } else {
                            int dem = a.count(v);
                            System.out.println("Chuỗi đã nhập: " + v);
                            System.out.println("Số lượng từ trong chuỗi: " + dem);
                            }
                        break;
                    case 2:
                        String k;
                        Scanner scc = new Scanner(System.in);
                        System.out.println("----------------------");
                        System.out.println("Chức năng 2 đang chạy");
                        System.out.print("Nhập vào chuỗi: ");
                        k = scc.nextLine();
                        String exx = "exit";
                        if(k.equals(exx)==true){
                            System.out.println("Bạn chọn thoát chương trình. Tạm biệt!");
                            System.exit(0);
                        } else {
                            String p = a.daonguoc(k);
                            System.out.println("Chuỗi sau khi đảo: " + p);
                            }
                        break;
                    default:
                        System.out.println("Không có chức năng tương ứng. Vui lòng nhập lại");
                        break;
                }
            }
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}