// There are N integers in an array A. All but one integer occurs in pairs. Your task is to find out the number that occurs only once
import java.util.*;
class abc
{
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        int a[], i,n, res=0;
        n=scanner.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        for(i=0;i<n;i++)
        {
            res=res^a[i];
        }
        System.out.println(res);
    }
}