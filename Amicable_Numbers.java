import java.util.Scanner;
class Main
{
    public static int div(int n)
    {
        int sum=0;
        for(int i=1;i<=(int)n/2;i++)
        {
            if(n%i==0)
            sum+=i;
        }
        return sum;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,res1,res2;
        a=sc.nextInt();
        b=sc.nextInt();
        res1=div(a);
        res2=div(b);
        if(b==res1 && a==res2)
        System.out.println("Amicable");
        else
        System.out.println("Not Amicable");
    }
}