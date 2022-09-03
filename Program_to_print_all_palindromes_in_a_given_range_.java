import java.util.Scanner;
class Main
{
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
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            if(ispalindrome(i))
            {
                System.out.print(i+" ");
                
            }
        }
    }
}