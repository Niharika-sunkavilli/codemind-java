import java.util.Scanner;
class Main
{
    public static boolean palindrome(int n)
    {
        int a=n,rem,sum=0;
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
        Scanner sc=new Scanner(System.in);
        int n,a,b=0;
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(palindrome(i))
            {
                a=i;
                break;
            }
        }
        for(int j=n-1;j>=1;j--)
        {
            if(palindrome(j))
            {
                b=j;
                break;
            }
        }
        if(n-b>a-n)
        System.out.println(a);
        else if(n-b<a-n)
        System.out.println(b);
        else
        System.out.println(b+" "+a);
    }
}