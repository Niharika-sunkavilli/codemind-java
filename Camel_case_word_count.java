import java.util.Scanner;
class Main
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int c=1;
        String s=sc.nextLine();
        for(int i=1;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}