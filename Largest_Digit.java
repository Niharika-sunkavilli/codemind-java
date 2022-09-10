import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,max=0;
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            if(max<rem)
            {
                max=rem;
            }
             
        }
        System.out.println(max);
    }
}