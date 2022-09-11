import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int m,n,t,rem;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            m=sc.nextInt();
            n=sc.nextInt();
            int c=0;
            for(int i=m;i<=n;i++)
            {
                rem=i%10;
                if(rem==2 || rem==3 || rem==9)
                {
                    c++;
                    
                }
            }
            System.out.println(c);
            t--;
        }
    }
}