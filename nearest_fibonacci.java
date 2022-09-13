import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a=0,b=1,c;
        while(b<n)
        {
            c=a+b;
            a=b;
            b=c;
        }
        if(n-a==b-n)
        System.out.println(a+" "+b);
        else if(n-a>b-n)
        System.out.println(b);
        else
        System.out.println(a);
    }
}