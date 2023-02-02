import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int e[]=new int[n];
        int o[]=new int[n];
        int j=0,k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            e[j++]=arr[i];
            else
            o[k++]=arr[i];
        }
        int min=Math.min(j,k);
        for(int i=0;i<min;i++)
        {
            System.out.print(o[i]+" "+e[i]+" ");
        }
        if(min==j)
        {
            for(int i=min;i<k;i++)
            System.out.print(o[i]+" ");
        }
        else
        {
            for(int i=min;i<j;i++)
            {
                System.out.print(e[i]+" ");
            }
        }
        if(n%2!=0)
        System.out.print("0");
    }
}