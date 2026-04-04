import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number: ");
        int n=sc.nextInt();
        int i=0;
        int j=1;
        int k=3;
        int a=0;
        System.out.print(i+","+j+",");
        while(k<=n)
        {      
            a=i+j;   
               System.out.print(a+",");
               i=j;
               j=a;
               k++;
        }
        sc.close();

        }
    }
    
       
    


