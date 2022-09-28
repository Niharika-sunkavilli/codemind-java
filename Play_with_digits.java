import java.util.Scanner;
class Main
{
    public static int digit(int n)
    {
        int rem,s=0;
        while(n>0)
        {
            rem=n%10;
            s=s+rem;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],sum=0,res=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            res=digit(arr[i]);
            sum=sum+res;
        }
        System.out.println(sum);
    }
}