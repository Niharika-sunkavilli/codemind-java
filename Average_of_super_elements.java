import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],c=0,flag=0,sum=0,count=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
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
            }
            if(arr[i]==c)
            {
                sum+=arr[i];
                flag=1;
                count++;
            }
           
        }
        
        if(flag==1)
        {
            float a=(float)sum/count;
        System.out.format("%.2f",a);
        }
       else
       System.out.println(-1);
    }
}