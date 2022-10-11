import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],f=0,s=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            f=f+arr[i];
        }
        for(int j=n/2;j<n;j++)
        {
            s=s+arr[j];
        }
        System.out.println(f);
        System.out.println(s);
    }
}