import java.util.Scanner;
class New
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  int c=0;
  for(int i=0;i<s.length();i++)
  {
     char ch=s.charAt(i);
	if(ch!=' ')
	{
	c++;
	}
	else
	{
	 System.out.print(c+" ");
	 c=0;
	}
  }
System.out.println(c);
 }
}