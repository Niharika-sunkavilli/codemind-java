import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=0,z=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=48 && ch<=57)
            {
                //System.out.println(ch);
                n=Character.getNumericValue(ch); 
                
                z+=n;
                
            }
            
        }
        System.out.println(z);
    }
}