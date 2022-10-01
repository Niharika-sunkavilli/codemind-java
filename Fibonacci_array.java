import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[];
        n=sc.nextInt();
        int c=0;
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n-2;i++)
        {
            if(arr[i-1]+arr[i]==arr[i+1])
            c=1;
            else
            c=2;
        }
        if(c==1)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}