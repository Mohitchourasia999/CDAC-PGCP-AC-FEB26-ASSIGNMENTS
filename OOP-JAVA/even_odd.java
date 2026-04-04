import java.util.Scanner;
public class even_odd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number : ");
        int n=sc.nextInt();
        System.out.println("even numbers between 1 and "+n+" is : ");
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
         System.out.println("odd numbers between 1 and "+n+" is : ");
        for(int i=0;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
       
    sc.close();

    }
}

