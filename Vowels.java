import java.util.*;
public class Vowels
{
	public static void main(String[] args) 
	{
	    char str;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet");
		str=sc.next().charAt(0);
	    if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u')
	    {
	       System.out.println("Vowel"); 
	    }
	    else
	    {
	        System.out.println("Consonant");
	    }
	    
	    
	}
}
