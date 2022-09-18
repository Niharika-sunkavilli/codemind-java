import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[],c=0;
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%k!=0)
            c++;
        }
        System.out.println(c);
    }
}