import java.util.Scanner;
class Main
{
    public static boolean isprime(int n)
    {
        if(n==1)
        return false;
        int c=0;
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
        int n,c=0,rem,l;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        l=(int)Math.log10(n)+1;
        if(isprime(n))//53
        {
            while(n>0)
            {
            rem=n%10;
            if(isprime(rem))
            {
                c++;
            }
            n=n/10;
            }
        }
        if(c==l)
        System.out.println("Mega Prime");
        else
        System.out.println("Not Mega Prime");
    }
}