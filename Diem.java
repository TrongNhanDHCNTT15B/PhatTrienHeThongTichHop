import java.util.Scanner;
public class Diem {
    private int x;
    private int y;
    public static void main(String[] args) {
        tongHop();
    }
//Các phương thức khởi tạo
public static Diem goc = new Diem();
public Diem(int x, int y){
    this.x = x;
    this.y = y;
}
public Diem(){
    this.x = 0;
    this.y = 0;
}
public Diem(Diem p){
    this.x = p.x;
    this.y = p.y;
}
public int getX(){
    return x;
}
public int getY(){
    return y;
}
public void setX(int x){
    this.x = x;
}
public void setY(int y){
    this.y = y;
}
public String toString(){
    return "("+x+","+y+")";
}
//ham nhap, in, tinh khoang cach.
public static void tongHop(){
    double xA, yA;
    double kc;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập hoành độ điểm A:");
    xA = scanner.nextDouble();
    System.out.println("Nhập tung độ điểm A: ");
    yA = scanner.nextDouble();
    System.out.println("A(" + xA + "," + yA + ")");
    kc = Math.sqrt(Math.pow((xA), 2) + Math.pow((yA), 2));
    System.out.println("Khoang cach tu A den O(0,0) la: " + kc);
}
}
