import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=1;
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ' && s.charAt(i+1)!= ' ')
            c++;
        }
        System.out.println(c);
    }
}