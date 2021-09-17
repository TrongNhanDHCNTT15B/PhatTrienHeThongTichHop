
    import java.util.Scanner;
class bai1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("\n\nNhập chuỗi cần in hoa: ");
    message = sc.nextLine();
    System.out.println("Chuỗi sau khi xử lý: ");
    System.out.println(message.toUpperCase());
  }
}