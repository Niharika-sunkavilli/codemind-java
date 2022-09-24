import java.util.Scanner;
class Lcm
{
    public static void main(String args[])
    {
        int a,b,max,lcm;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>=b)
            max=a;
        else
           max=b;
        for(int i=max; ;i++)
        {
            if(i%a==0 && i%b==0)
             {
              lcm=i;
              break;
             }
        }
        System.out.println(lcm);
        sc.close();
    }
}