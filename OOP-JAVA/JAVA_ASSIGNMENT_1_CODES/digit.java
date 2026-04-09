import java.util.Scanner;
public class digit{
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number: ");
        int n=sc.nextInt();
        int count=0;
        while(n>0)
        {
           count++;
            n/=10;
           
        }
        System.out.println("count of digits in entered number ="+count);
        sc.close();
    }
}
