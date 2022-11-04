import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char h=sc.nextLine().charAt(0);
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                if(ch==h)
                {
                    System.out.println("True");
                    System.out.println(i);
                    c=1;
                    break;
                }
                
            }
            
        }
        if(c==0)
        System.out.println("False");
        
    }
}