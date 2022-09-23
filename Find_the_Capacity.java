import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,t,b;
        s=sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        System.out.println((s*t*b)+"KB");
    }
}