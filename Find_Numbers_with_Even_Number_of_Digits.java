import java.util.Scanner;
class Main
{
    public static int digit(int n)
    {
        int d;
        d=(int)Math.log10(n)+1;
        return d;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],count=0,res=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            res=digit(arr[i]);
            if(res%2==0)
            count++;
        }
        System.out.println(count);
    }
    
}