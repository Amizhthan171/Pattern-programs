import java.util.*;

public class numpat9{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;++i)
        {
            int first=1;
                for(int j=1;j<=i;++j)
                {
                    System.out.print(first);
                    first=(first==0)?1:0;
                }
            System.out.println();
            }
    }
}