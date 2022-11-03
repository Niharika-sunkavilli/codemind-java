import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],e=0,o=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            e+=arr[i];
            else
            o+=arr[i];
        }
        int a=(int)Math.abs(e-o);
        System.out.println(a);
    }
}