import java.util.Scanner;
public class sum_n {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any natural number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of first "+n+" natural numbers : "+sum);
        sc.close();
    }
}
