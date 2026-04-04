import java.util.Scanner;
public class largest {
    public static void main(String[] args)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter three numbers:");
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          if(a>b&&a>c)
            System.out.println("largest number is: "+a);
          if(b>a&&b>c)
            System.out.println("largest number is: "+b);
          if(c>a&&c>b)
            System.out.println("largest number is: "+c);
        sc.close();
    }
    
}
