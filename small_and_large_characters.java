import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char min='z',max='A';
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
            if(min>ch)
            min=ch;
            if(max<ch)
            max=ch;
            }
            else
            {
            System.out.print(min+" "+max+" ");
            min='z';
            max='A';
            }
        }
        System.out.println(min+" "+max);
    }
}