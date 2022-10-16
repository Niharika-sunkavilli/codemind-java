import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],c=0,max=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            c++;
            else
            {
                if(max<c)
                {
                max=c;
                c=0;
                }
            }
        }
        if(c>max)
        max=c;
        System.out.println(max);
    }
}