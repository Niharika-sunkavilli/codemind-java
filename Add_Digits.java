import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,s=0;
        n=sc.nextInt();
        while(n>9)
        {
            s=0;
            while(n>0)
            {
            rem=n%10;
            s+=rem;
            n=n/10;
            }
        n=s;
        }
        System.out.println(s);
    }
}