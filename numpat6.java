import java.util.*;

public class numpat6{
    
    public static void main(String args[])
    {
        int k;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;++i,--k)
        {
             k=n;
            for(int j=1;j<=i;++j)
                System.out.print(k--);
            System.out.print("\n");
        }
    }
}