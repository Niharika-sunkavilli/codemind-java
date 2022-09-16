import java.util.Scanner;
class Main
{
    public static boolean prime(int n)
    {
        int c=0;
        if(n==1)
        return true;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,s=0,n=0;
        a=sc.nextInt();
        b=sc.nextInt();
        s=a+b;
        for(int i=s+1;;i++)
        {
            if(prime(i))
            {
                n=i;
                System.out.println(i-s);
                break;
            }
        }
    }
}