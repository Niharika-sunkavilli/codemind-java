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
        int n,arr[];
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(isprime(arr[i]))
            c++;
            
        }
        System.out.println(c);
    }
}