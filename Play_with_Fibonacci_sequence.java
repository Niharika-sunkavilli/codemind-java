import java.util.Scanner;
class While
{
   public static void main(String args[])
   {
   int n,a=0,b=1,c,count=3;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   System.out.print(a+" "+b+" ");
   c=a+b;
   while(count<=n)
   {
     System.out.print(c+" ");
      a=b;
      b=c;
      c=a+b;
      count++;
    }
   sc.close();
   }
}