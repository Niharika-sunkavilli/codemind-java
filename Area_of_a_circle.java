import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int r;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        float area;
        area=(float)3.14*r*r;
        System.out.format("%.2f",area);
    }
}