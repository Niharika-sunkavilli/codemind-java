import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],c=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=1;
            if(arr[i]!=-99)
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[i]==arr[j] && i!=j)
                    {
                        c++;
                        arr[j]=-99;
                    }
                }
                //System.out.println(c);
            }
            if(c>1)
                System.out.println(arr[i]);
        }
    }
}