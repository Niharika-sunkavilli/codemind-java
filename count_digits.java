import java.util.Scanner;
class Main
{
    public static int count(int n)
    {
        int d;
        n=Math.abs(n);
        if(n==0)
        return 1;
        d=(int)Math.log10(n)+1;
        return d;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],res=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            //System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            res=count(arr[i]);
            System.out.print(res+" ");
        }
    }
}