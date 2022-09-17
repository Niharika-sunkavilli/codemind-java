import java.util.Scanner;
class Main
{
    public static boolean prime(int n)
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
        int n,k,c=0;
        int arr[];
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
            {
                if(prime(arr[i]))
                c++;
            }
            else
            continue;
        }
        System.out.println(c);
        
    }
}