import java.util.Scanner;
class ArraySum
{
    public static void main(String[] args) 
    {
        int N,K,S=0;
        Scanner l=new Scanner(System.in);
        N=l.nextInt();
        K=l.nextInt();
        int a[] = new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=l.nextInt();
        }
        for(int i=0;i<K;i++)
        {
            S+=a[i];
        }
        System.out.println(S);
    }
}
