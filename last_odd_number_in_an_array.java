import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],x=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
       
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            x=arr[i];
        }
        System.out.println(x);
    }
}