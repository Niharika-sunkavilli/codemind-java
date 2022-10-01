import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],fs=0,ss=0;
        n=sc.nextInt();
        arr=new int[n];
       
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         
        for(int i=0;i<n/2;i++)
        {
        fs+=arr[i];
        }
        for(int j=n/2;j<n;j++)
        {
        ss+=arr[j];
        }
        System.out.println(ss-fs);
        
        
    }
}