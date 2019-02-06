import java.util.*;
class Greatest
{
	public static void main(String args[]) 
	{
	    int n1,n2,n3;
	    Scanner g=new Scanner(System.in);
		n1=g.nextInt();
		n2=g.nextInt();
		n3=g.nextInt();
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
