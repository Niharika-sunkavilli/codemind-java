import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,c=0;
        int arr[];
        n=sc.nextInt();
        k=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%k==0)
            c++;
        }
        System.out.println(c);
    }
}