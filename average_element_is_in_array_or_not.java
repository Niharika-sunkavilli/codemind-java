import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],sum=0,d=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        d=sum/n;
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(d==arr[i])
            {
                f=1;
                break;
            }
            
        }
        if(f==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}