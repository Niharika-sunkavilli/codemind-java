import java.util.Scanner;
class Main
{
    public static boolean palindrome(int n)
    {
        int a=n,c=0,rev=0,rem;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(a==rev)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],c=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(palindrome(arr[i]))
            c++;
        }
        System.out.println(c);
    }
}