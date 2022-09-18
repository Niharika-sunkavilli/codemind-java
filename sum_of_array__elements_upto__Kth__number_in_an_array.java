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
        int a=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(arr[i]>=a)
            break;
        }
        System.out.println(sum);
    }
}