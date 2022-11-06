import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                a=ch+a;
            }
            else
            {
                System.out.print(a+" ");
                a="";
            }
        }
        System.out.println(a);
    }
}