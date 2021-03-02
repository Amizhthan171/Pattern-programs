import java.util.*;

public class numpat10{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space =0;
        for(int i=n,b=1;i>=1;--i,++space,++b)
        {
            for(int j=1;j<=space;++j)
            System.out.print(" ");
            int a=b;
            for(int k=1;k<=2*i-1;++k,++a)
                System.out.print(a);
            
            System.out.print("\n");
                
        }
        space=n-1;
        for(int i=1;i<=n;++i,--space)
        {
            for(int j=1;j<=space;++j)
                System.out.print(" ");
            int a=space+1;
            for(int k=1;k<=2*i-1;++k,++a)
                System.out.print(a);
            
           System.out.print("\n");

        }
    }
}