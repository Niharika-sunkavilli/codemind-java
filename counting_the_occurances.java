import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        String s=sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            char z=s.charAt(i);
            if(z==ch)
            c++;
        }
        if(c>0)
        System.out.println(c);
        else
        System.out.println(-1);
    }
}