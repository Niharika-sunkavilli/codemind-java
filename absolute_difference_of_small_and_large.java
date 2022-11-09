import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int total=0;
        char min='z',max='A';
        String s=sc.nextLine();
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
                total=Math.abs((int)min-(int)max);
                System.out.print(total+" ");
                min='z';
                max='A';
                total=0;
            }
        }
        total=Math.abs((int)min - (int)max);
        System.out.println(total);
    }
}