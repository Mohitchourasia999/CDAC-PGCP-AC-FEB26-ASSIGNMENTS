import java.util.Scanner;
public class evaluator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers:- ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        // here bodmas rule is used first multiply c to a and b then add it.
        System.out.print("\nperforming (a + b) * c and result is :-");
        System.out.println(((a + b) * c));

         // the expression has logical and relational operator , in this experission 'AND' logical operator and '>(greater than)' relational operator is used
         //which returns value in boolean means true or false , if a>b and b>c is correct it prints true otherwise it prints false , because using and logical operator between 
         // two conditions only true when both are > greater conditions are true.
        System.out.print(" \nperforming a > b && b > c  and result is :- ");
        System.out.println( a > b && b > c );

         // it return the remainder of the expression
        System.out.print("\nperforming a % b  and result is :- ");
        System.out.println(a % b );

        sc.close();
    }
}
