import java.util.Scanner;
class Main
{
    public static int sum(int n)
    {
        int rem;
        while(n>9)
        {
            int sum=0;
            while(n>0)
            {
                rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            n=sum;
        }
        return n;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,res;
        n=sc.nextInt();
        res=sum(n);
        System.out.println(res);
    }
}