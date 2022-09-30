import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,e=0,o=0,rem=0;
        n=sc.nextInt();
        c=(int)Math.log10(n)+1;
        while(n>0)
        {
            rem=n%10;
            if(rem%2==0)
            e++;
            else
            o++;
            n=n/10;
        }
        if(c==e)
        System.out.println("Even");
        else if(c==o)
        System.out.println("Odd");
        else
        System.out.println("Mixed");
    }
}