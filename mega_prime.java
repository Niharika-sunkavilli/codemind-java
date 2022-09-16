import java.util.Scanner;
class Main
{
    public static boolean prime(int n)
    {
        int count=0;
        if(n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
            
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,c=0,d;
        n=sc.nextInt();
        d=(int)Math.log10(n)+1;
        if(prime(n))
        {
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            if(prime(rem))
            c++;
        }
        if(c==d)
        System.out.println("Mega Prime");
        else
        System.out.println("Not Mega Prime");
        
        }
        else
        System.out.println("Not Mega Prime");
    }
}