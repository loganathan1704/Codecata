import java.util.*;
public class Greatest
{
	public static void main(String[] args) 
	{
	    int n1,n2,n3;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
	    if((n1>n2)&&(n1>n3))
	    {
	       System.out.println(n1); 
	    }
	    else if((n2>n1)&&(n2>n3))
	    {
	        System.out.println(n2);
	    }
	    else
	    {
	        System.out.println(n3);
	    }
	    
	    
	}
}
