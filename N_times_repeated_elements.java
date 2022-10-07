import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],k,c=0,flag=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            c=1;
            if(arr[i]!=-99)
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[i]==arr[j] && i!=j)
                    {
                        c++;
                        arr[j]=-99;
                    }
                }
                if(c==k)
                {
                    System.out.print(arr[i]+" ");
                    flag=1;
                }
                
            }
        }
        if(flag==0)
        System.out.println(-1);
    }
}