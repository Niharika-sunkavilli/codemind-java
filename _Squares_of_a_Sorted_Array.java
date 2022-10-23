import java.util.Scanner;
class Incomplete
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],c,newarr[],h;
        
        n=sc.nextInt();
        newarr=new int[n+1];
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=arr[i]*arr[i];
            newarr[i]=c;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(newarr[i]>newarr[j])
                {
                    h=newarr[i];
                    newarr[i]=newarr[j];
                    newarr[j]=h;
                }
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(newarr[i]+" ");
    }
}

