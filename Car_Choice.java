import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,a1,b1,a2,b2;
        float car1=0,car2=0;
        t=sc.nextInt();
        //System.out.println((float)3/10);
        while(t>0)
        {
            a1=sc.nextInt();
            b1=sc.nextInt();
            a2=sc.nextInt();
            b2=sc.nextInt();
            car1=(float)a2/a1;
            car2=(float)b2/b1;
            if(car1<car2)
            System.out.println(-1);
            else if(car1==car2)
            System.out.println(0);
            else
            System.out.println(1);
           t--; 
        }
    }
}