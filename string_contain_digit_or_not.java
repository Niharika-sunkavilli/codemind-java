import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=48 && ch<=57)
            c++;
        }
        if(c>0)
        System.out.println("Contains "+c+" digit");
        else
        System.out.println("Doesn't contain digit");
    }
}