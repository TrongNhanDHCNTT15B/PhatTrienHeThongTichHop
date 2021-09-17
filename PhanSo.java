import java.util.Scanner;
public class PhanSo {
    private int ts;
    private int ms;
    public static void main(String[] args) {
        inNghichTraVe();
    }
public static PhanSo goc = new PhanSo();
public PhanSo(int ts, int ms){
    this.ts = ts;
    this.ms = ms;
}
public PhanSo(){
    this.ts = 0;
    this.ms = 0;
}
public PhanSo(PhanSo p){
    this.ts = p.ts;
    this.ms = p.ms;
}
public int getTs(){
    return ts;
}
public int getMs(){
    return ms;
}
public void setTs(int ts){
    this.ts = ts;
}
public void setMs(int ms){
    this.ms = ms;
}
public String toString(){
    return "("+ts+","+ms+")";
}
public static void inNghichTraVe(){
    double ts, ms;
    double tam = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập tử số:");
    ts = scanner.nextDouble();
    System.out.println("Nhập mẫu số: ");
    ms = scanner.nextDouble();
    System.out.println(ts + "/" + ms);
    System.out.println("Giá trị thực = " + ts/ms);
    tam = ms;
    ms = ts;
    ts = tam;
    System.out.println("Sau khi nghịch đảo:" + ts + "/" + ms);
}
}
