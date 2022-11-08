import java.util.Scanner;
import java.util.Arrays;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String sum=a+b;
        //System.out.println(sum);
        char ch[]=sum.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<sum.length();i++)
        System.out.print(ch[i]);
    }
}