import java.util.Scanner;
class Main
{
    public static boolean isprime(int n)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,s,c=0;
        n1=sc.nextInt();
        n2=sc.nextInt();
        s=n1+n2;
        for(int i=s+1;;i++)
        {
            c++;
            if(isprime(i))
            {
                break;
            }
        }
        System.out.println(c);
    }
}