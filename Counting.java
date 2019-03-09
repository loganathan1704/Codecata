import java.util.Scanner;
class Counting
{
	public static void main(String[] args) 
  {
		int N,C=0;
		Scanner sc=new Scanner(System.in);		
		N=sc.nextInt();
		while(N>0) 
    {
			N= N/10;
			C=C+1; 
		}
		System.out.print(C);
	}
}
