import java.util.*;

public class numpat2{
    
    public static void main(String args[])
    {
        int k=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;++i)
        {
            for(int j=1;j<=i;++j)
                System.out.print(k++);
            System.out.print("\n");
        }
    }
}