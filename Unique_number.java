import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],rem,c=0;
        n=sc.nextInt();
        arr=new int[n];
        int i=0;
        while(n>0)
        {
            rem=n%10;
            arr[i]=rem;
            i++;
            n=n/10;
        }
        for(int j=0;j<i;j++)
        //System.out.print(arr[j]+" ");
        {
            c=1;
            if(arr[j]!=-99)
            {
                for(int k=0;k<i;k++)
                {
                    if(arr[j]==arr[k] && j!=k)
                    {
                        arr[k]=-99;
                        c++;
                    }
                }
                if(c>1)
                {
                System.out.println("Not Unique Number");
                break;
                    
                }
            }
        }
        if(c==1)
        System.out.println("Unique Number");
    }
}