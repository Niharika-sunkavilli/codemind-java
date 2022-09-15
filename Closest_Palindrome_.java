import java.util.Scanner;
class Main
{
    public static boolean palindrome(int n)
    {
        int a=n;
        int rem,rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(a==rev)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=0;
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(palindrome(i))
            {
                a=i;
                break;
            }
        }
        for(int i=n-1;i>=1;i--)
        {
            if(palindrome(i))
            {
                b=i;
                break;
            }
        }
        if(n-b == a-n)
        System.out.println(b+" "+a);
        else if(n-b>a-n)
        System.out.println(a);
        else
        System.out.println(b);
    }
}