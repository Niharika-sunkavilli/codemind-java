import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int minsum=0,maxsum=0;
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
                minsum+=(int)min;
                maxsum+=(int)max;
                //System.out.print(min+" "+max+" ");
                min='z';
                max='A';
            }
        }
        //System.out.print(min+" "+max);
        minsum+=(int)min;
        maxsum+=(int)max;
        int total=Math.abs(minsum-maxsum);
        System.out.println(total);
    }
}