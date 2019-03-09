import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
	     int[] a=new int[100];
	   int n,k,i,s=0;
	Scanner e=new Scanner(System.in);
	System.out.print("enter n");
	 n=e.nextInt();
	for(i=0;i<n;i++)
	{
	   
	   a[i]=e.nextInt();
    }
    k=e.nextInt();
	for(i=0;i<k;i++)
	{
		s=s+a[i];
	}
	
  System.out.print(s);
    }
}
