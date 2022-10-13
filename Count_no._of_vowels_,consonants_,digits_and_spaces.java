import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0,d=0,sp=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            v++;
            else if(ch==' ')
            sp++;
            else if(ch>=48 && ch<=57)
            d++;
            else
            c++;
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+sp);
    }
}