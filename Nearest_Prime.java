import java.util.Scanner;
class NearestPrime
{
  public static boolean isPrime(int n)
  {
     int count=0;
	 for(int i=2;i<=(int)Math.sqrt(n);i++)
	 {
	    if(n%i==0)
		  count++;
	 }
	 if(count==0)
	    return true;
	 else
	    return false;
  }
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int n,i,before,after,t;
	 t=sc.nextInt();
	 while(t>0)
	 {
         n=sc.nextInt();
         for(i=n;;i--)
         {
             if(isPrime(i))
		    {
		        before=i;
                   break;
		    }
	     } 
	     for(i=n;;i++)
	    {
	        if(isPrime(i))
		    {
		      after=i;
                   break;
    		 }
    	 } 
            if((n-before)<=(after-n))
                System.out.println(before);
            else
                System.out.println(after);
    t--;
	 }
    	 
      }
      
    }