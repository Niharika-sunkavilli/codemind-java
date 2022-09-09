import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        float a,b,mul;
        a=sc.nextFloat();
        b=sc.nextFloat();
        mul=(float)(a*b);
        
        System.out.format("%.2f",mul);
    }
}