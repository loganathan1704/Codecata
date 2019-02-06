import java.util.*;
class NumCheck
{
	public static void main(String[] args) 
	{
	    int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	    if(num>=1)
	    {
	       System.out.println("Positive"); 
	    }
	    else if(num==0)
	    {
	        System.out.println("Zero");
	    }
	    else if(num<0)
	    {
	        System.out.println("Negative");
	    }
	    
