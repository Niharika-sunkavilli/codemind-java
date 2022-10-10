import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],c=0,f=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            c++;
            if(arr[i]%2!=0 && i%2!=0)
            f++;
        }
        if(c==f)
        System.out.println("True");
        else
        System.out.println("False");
    }
}