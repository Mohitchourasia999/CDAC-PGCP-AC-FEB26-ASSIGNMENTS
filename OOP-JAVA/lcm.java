import java.util.Scanner;
public class lcm {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter two number");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int a1=a , b1=b;
         int l=0;
         /*EXPLANATION
         SUPPOSE a=6 AND b=8
         divide greater num by smaller and keep adding if mod not = zero
         ex:
          8 % 6 != 0
          16 % 6 != 0
          24 % 6 = 0
          so last greater is lcm   */
         if(a>b)
         {
            while(true)
            {
                if(a%b==0)
                {
                    l=a;
                    break;
                }
                else{
                    a=a+a1;}
            }
            
         }
         else{
             while(true)
            {
                if(b%a==0)
                {
                    l=b;
                    break;
                }
                else{
                    b=b+b1;}
            }
         }
         System.out.println("LCM of "+a1+" and "+b1+" is "+l);
         sc.close();
    }
}
