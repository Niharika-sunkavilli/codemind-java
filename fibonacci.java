import java.util.Scanner;
class Fibnocii3
{
    public static void main(String args[])
    {
      int n,a=0,b=1,c,count=3;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.print(a+" "+b+" ");
      while(count<=n)
      {
        c=a+b;
        a=b;
        b=c;
        System.out.print(c+" ");
      count++;
      }     
      sc.close();
    }
}