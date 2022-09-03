import java.util.Scanner;
class Main
{
    public static boolean isprime(int n)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
          return true;
        else
          return false;
    }
    public static boolean ispalindrome(int n)
    {
        int a=n;
        int sum=0,rem;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(a==sum)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n+1; ;i++)
        {
            if(isprime(i) && ispalindrome(i))
            {
                System.out.println(i);
                break;
            }
        }
    }
}