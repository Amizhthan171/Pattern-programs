import java.util.*;

public class pat12{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        for(int i=1;i<=n;++i,--space)
        {
            for(int j=1;j<=space;++j)
                System.out.print(" ");
                for(int k=1;k<=2*i-1;++k)
                    if(i==1 || i== n|| k==(2*i-1)|| k==1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
           System.out.print("\n");

        }
    }
}