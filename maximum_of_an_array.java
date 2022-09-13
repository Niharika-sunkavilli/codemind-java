import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0;
        n=sc.nextInt();
        int arr[];
        arr=new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
            int max=arr[0];
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
            s=max;
        }
        System.out.println(s);
    }
}