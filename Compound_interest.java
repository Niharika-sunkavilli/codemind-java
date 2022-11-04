import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,t,r;
        double si;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        si=p*(Math.pow((1+t/100),r));
        System.out.format("%.2f",si);
    }
}