import java.util.*;

public class numpat8{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first;
        for(int i=1;i<=n;++i)
        {
            if(i%2==0)
            {
                first=0;
                for(int j=1;j<=n;++j)
                {
                    System.out.print(first);
                    first=(first==0)?1:0;
                }
            }
            else
            {
                first=1;
                for(int j=1;j<=n;++j)
                {
                    System.out.print(first);
                    first=(first==0)?1:0;
                }
            }
            System.out.println();
        }
    }
}