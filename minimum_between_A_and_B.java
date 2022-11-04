import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],a,b,min=9999,c=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                if(arr[i]<min)
                min=arr[i];
                c++;
            }
        }
        if(c>0)
        System.out.println(min);
        else
        System.out.println(-1);
    }
}