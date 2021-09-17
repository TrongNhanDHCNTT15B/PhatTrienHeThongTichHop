import java.util.Scanner;
class bai2
{
    public static void main(String args[])
    {
        int tam;
        boolean kiemTra=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int so=scan.nextInt();
        scan.close();
        for(int i=2;i<=so/2;i++)
        {
            tam=so%i;
            if(tam==0)
            {
                kiemTra=false;
                break;
            }
        }
        if(kiemTra)
            System.out.println(so + " là số nguyên tố");
        else
            System.out.println(so + " không là số nguyên tố");
    }
}
