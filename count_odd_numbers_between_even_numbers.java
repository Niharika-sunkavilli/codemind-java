import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],c=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n-1;i++)
        {
            if(arr[i-1]%2==0 && arr[i]%2!=0 && arr[i+1]%2==0)
            {
                c++;
            }
        }
        
        System.out.println(c);
        
    }
}