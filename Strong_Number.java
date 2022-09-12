import java.util.Scanner;
class Main
{
    public static int fact(int n)
    {
        int f=1;
        for(int i=n;i>=1;i--)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,rem,total=0,res=0;
        
        n=sc.nextInt();
        a=n;
        while(n>0)
        {
             rem=n%10;
             n=n/10;
             res=fact(rem);
             total+=res;
             
        }
        if(total==a)
        System.out.println("The number "+a+" is a strong number");
        else
        System.out.println("The number "+a+" is not a strong number");
    }
}