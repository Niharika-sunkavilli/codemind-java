import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[];
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int e=sc.nextInt();
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==e)
            f=1;
        }
        if(f==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}