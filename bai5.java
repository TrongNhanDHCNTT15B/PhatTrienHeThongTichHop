import java.util.Scanner;
public class bai5{
public static void main(String[] args) {
    float sum = 0, number;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập số(Nhập 0 để dừng): ");
        number = scanner.nextFloat();
        if (number > 0)
            sum += number;
    } while (number != 0);
         
    System.out.println("Tổng = " + sum);
}
}