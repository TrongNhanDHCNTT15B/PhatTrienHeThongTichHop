import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        num = sc.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }
        System.out.println("Tổng từ 1 đến "+ num +" là: "+sum);
    }
}