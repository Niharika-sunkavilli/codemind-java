import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr1[],arr2[],sum;
        n=sc.nextInt();
        arr1=new int[n];
        arr2=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            arr2[j]=sc.nextInt();
        }
        sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum=arr1[i]+arr2[i];
            }
            System.out.print(sum+" ");
        }
        
        
    }
}