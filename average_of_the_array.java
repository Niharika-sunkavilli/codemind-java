import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int arr[];
        n=sc.nextInt();
        arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.format("%.2f",(float)sum/n);
    }
}