import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],z,count=0;
      
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        z=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==z)
            count++;
        }
     System.out.println(count);   
    }
}