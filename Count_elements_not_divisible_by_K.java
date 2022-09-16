import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,k,count=0;
        int arr[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k!=0)
            count++;
        }
        System.out.println(count);
    }
}