import java.util.*;

public class pat4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for( int i=1;i<=n;++i)
        {
            for(int j=1;j<=n-i;++j)
        		System.out.print(" ");
        	for(int k=1;k<=2*i-1;++k )
        		System.out.print("*");
        	
        	System.out.print("\n");
        }
        int space=1;
        for(int i=n-1;i>=1;--i)
        {
           for(int k=1;k<=space;++k)
               System.out.print(" ");
            for(int j=1;j<=2*i-1;++j)
               System.out.print("*");
            ++space;
            System.out.print("\n");
        }
    }
}