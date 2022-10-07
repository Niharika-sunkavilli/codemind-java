import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],even[],odd[],j=0,k=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        even=new int[n];
        odd=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even[j]=arr[i];
                j++;
            }
            else
            {
                odd[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<k;i++)
        System.out.print(odd[i]+" ");
        for(int i=0;i<j;i++)
        System.out.print(even[i]+" ");
    }
}