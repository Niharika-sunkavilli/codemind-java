import java.util.Scanner;
class Main
{
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
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            System.out.print(arr[i]+" ");
        }
    }
}