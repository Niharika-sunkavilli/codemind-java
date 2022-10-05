import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],a,b,max=0,c=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<a || arr[i]>b)
            {
                //System.out.println(arr[i]);
                if(arr[i]>max)
                {
                    max=arr[i];
                    c++;
                }
            }
        }
        if(c<=0)
        System.out.println(-1);
        else
        System.out.println(max);
    }
}