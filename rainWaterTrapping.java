import java.util.*;
public class rainWaterTrapping {
    public static void main(String[]args)
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print(storage(a,n));
    }

    public static int storage(int a[],int n)
    {
        int l[]=new int[n];
        int r[]=new int[n];
        l[0]=a[0];
        r[n-1]=a[n-1];
        int rw=0;
        for(int i=1;i<n;i++)
        {
             l[i]=Math.max(l[i-1],a[i]);
        }

        for(int i=n-2;i>=0;i--)
        {
            r[i]=Math.max(r[i+1],a[i]);
        }

        for(int i=0;i<n;i++)
        {
            rw+=Math.min(l[i],r[i])-a[i];
        }
        return rw;
    }
}
