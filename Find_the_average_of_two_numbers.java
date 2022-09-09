import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a,b;
        float avg;
        a=sc.nextInt();
        b=sc.nextInt();
        avg=(float)(a+b)/2;
        
        System.out.format("%.4f",avg);
    }
}