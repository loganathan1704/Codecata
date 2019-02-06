import java.util.*;
public class Main
    {
        public static void main(String args[])
        {
            char c;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the alphabet");
            c=s.next().charAt(0);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
            {
                System.out.println("Alphabet");
            }
            else
            {
            System.out.println("No");   
            }
            
        }
    }
