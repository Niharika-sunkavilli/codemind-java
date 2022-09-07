import java.util.Scanner;
class Main
{
    public static boolean ispalindrome(int n)
    {
        int a=n;
        int rem,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(a==sum)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        int arr[];
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(ispalindrome(arr[i]))
            {
               c++; 
            }
        }
        System.out.println(c);
    }
}