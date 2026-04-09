import java.util.Scanner;
public class palindrone {
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number: ");
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n>0)
        {
            int a=n%10;
            rev=rev*10+a;
            n/=10;
        }
        if(rev==temp)
        System.out.println("entered number is palindrone");
        else
            System.out.println("entered number is not a palindrone");
        sc.close();
    }
}
