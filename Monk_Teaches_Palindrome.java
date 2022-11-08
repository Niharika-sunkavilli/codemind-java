import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n>0)
        {
            String s=sc.nextLine();
            String a="";
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                a=ch+a;
            }
           // System.out.println(a);
            if(s.contains(a))
            {
                if(s.length()%2==0)
                {
                    //System.out.println(s.length());
                    System.out.println("YES EVEN");
                }
                else
                System.out.println("YES ODD");
            }
            else
            System.out.println("NO");
            n--;
        }
    }
}