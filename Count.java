import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],e=0,o=0;
        n=sc.nextInt();
        //System.out.println(n);
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            //System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            e++;
            else
            o++;
        }
        System.out.print(e+" "+o);
        
    }
}