import java.util.*;

public class pat10{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        for(int i=1;i<=n;++i,--space)
        {
            for(int j=1;j<=space;++j)
                System.out.print(" ");
            for(int k=1;k<=i;++k)
                System.out.print("*");
            System.out.print("\n");
        }
        space=1;
        for(int i=n-1;i>=1;--i,++space)
        {
            for(int j=1;j<=space;++j)
                System.out.print(" ");
            for(int k=i;k>=1;--k)
                System.out.print("*");
            
            System.out.print("\n");
        }
    }
}