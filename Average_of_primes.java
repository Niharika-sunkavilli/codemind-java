import java.util.Scanner;
class Main
{
    public static boolean isprime(int n)
    {
        int count=0;
        if(n==1)
        return false;
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],sum=0,c=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(isprime(arr[i]))
            {
                sum=sum+arr[i];
                c++;
            }
        }
       
        System.out.format("%.2f",(float)sum/c);
    }
}