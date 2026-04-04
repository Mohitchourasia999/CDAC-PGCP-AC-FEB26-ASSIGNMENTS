import java.util.Scanner;
public class larg_digit {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        while(n>0)
        {
            int a=n%10;
           
               
                if(temp<a)
                {
                    temp=a;
                }
            n/=10;
        }
        System.out.println("largest digit in entered number is : "+temp);
        sc.close();
    }
}
