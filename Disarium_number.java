import java.util.Scanner;
class Main
{
    public static boolean disarium(int n)
    {
        int d,rem,sum=0;
        int a=n;
        d=(int)Math.log10(n)+1;
        while(n>0)
        {
            rem=n%10;
            sum=sum+(int)Math.pow(rem,d);
            n=n/10;
            d--;
        }
        if(a==sum)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(disarium(n))
        System.out.println("True");
        else
        System.out.println("False");
    }
}