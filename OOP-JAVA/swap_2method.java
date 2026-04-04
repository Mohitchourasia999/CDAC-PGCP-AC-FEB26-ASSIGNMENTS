import java.util.Scanner;
public class swap_2method {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any two numbers for swapping");
        int n=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("values before swapping of n and b is "+n+","+b);
        n=n+b;
        b=n-b;
        n=n-b;
        System.out.println("values after swapping of n and b is "+n+","+b);
        sc.close();
    }
}


    

