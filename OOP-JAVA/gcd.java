import java.util.Scanner;
public class gcd {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter two number");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int a1=a , b1=b;
         int l=0;
         /*EXPLANATION
         SUPPOSE a=48 AND b=18
         divide greater num by smaller and keep adding if mod not = zero
         ex:
          48 % 18 =12 but !=0
          18 % 12 = 6
          12 % 6 = 0
          so 6 is the gcd(greatest common divisor)  */
         if(a>b)
         {
            while(true)
            {
                if(a%b!=0)
                {
                   int c=a%b;
                   a=b;
                   b=c;
                }
                else{
                   l=b;
                   break;
            }
            }
            
         }
         else{
             while(true)
            {
                if(b%a!=0)
                {
                    int c=b%a;
                    b=a;
                    a=c;
                }
                else{
                   l=a;
                   break;
                
            }
            }
         }
         System.out.println("gcd of "+a1+" and "+b1+" is "+l);
         sc.close();
    }
}
