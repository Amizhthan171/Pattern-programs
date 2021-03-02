import java.util.*;

public class pat13{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=0;
        for(int i=n;i>=1;--i,++space)
        {
            for(int j=1;j<=space;++j)
                System.out.print(" ");
            
            for(int k=2*i-1;k>=1;--k)
                if(k==(2*i-1) || k==1 || i==n || i==1)
                System.out.print("*");
                else
                    System.out.print(" ");
            
            System.out.print("\n");
        }
    }
}