import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,arr[];
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0 || arr[i]==1)
            c++;
        }
        if(c==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}