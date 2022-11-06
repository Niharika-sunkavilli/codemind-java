import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            s=sc.nextLine();
           // System.out.println(s);
            int c=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch>=48 && ch<=57)
                {
                    c++;
                    //System.out.println(ch);
                }
            }
            if(c>0)
            System.out.println("Yes");
            else
            System.out.println("No");
            
            t--;
        }
    }
}
