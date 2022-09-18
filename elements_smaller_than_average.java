import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[];
        int n,sum=0,e=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        e=sum/n;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=e)
            c++;
        }
        System.out.println(c);
    }
}