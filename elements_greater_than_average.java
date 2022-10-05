import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],sum=0,avg=0,c=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg=sum/n;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=avg)
            c++;
        }
        System.out.println(c);
    }
}