import java.util.Scanner;
class Codemind
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
	for(int i=n;i>=1;i--)
	{
	  for(int j=i;j>=1;j--)
		{
		  System.out.print((char)(64+i)+" ");
		}
		System.out.println();
	}
  }
}
