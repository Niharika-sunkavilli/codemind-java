import java.util.Scanner;
class Main
{
    public static boolean isprime(int x)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(x);i++)
        {
            if(x%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static int reverse(int a)
    {
        int p=a;
        int rem,sum=0;
        while(a>0)
        {
            rem=a%10;
            sum=sum*10+rem;
            a=a/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(!isprime(n))
        System.out.println("not prime");
        else if(isprime(reverse(n)))
        System.out.println("circular prime");
        else
        System.out.println("prime but not a circular prime");
    }
}


