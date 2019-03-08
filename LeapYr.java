import java.util.*;
public class LeapYr
{
	public static void main(String[] args) 
	{
		int year;
		Scanner y=new Scanner(System.in);
		year=y.nextInt();
		if(year%4==0)
		{
		     if( year % 100 == 0)
		     {
		        if ( year % 400 == 0)
		            System.out.print("yes");
		        else
		           System.out.print("no"); 
		      }
              else
                 System.out.print("yes"); 
              }
		     else
		         System.out.print("no"); 
		
	}
}
	
	
