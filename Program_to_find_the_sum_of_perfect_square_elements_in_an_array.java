import java.util.Scanner;
class Main
{
    public static boolean square(int n)
    {
        double b=Math.sqrt(n);
        if(b-(int)b>0)
        return false;
        else
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],sum=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(square(arr[i]))
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
