import java.util.Scanner;
public class table{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number of which table you want");
        int n=sc.nextInt();
        System.out.println("enter a limit to which you want  multiplication table of entered number ");
        int l=sc.nextInt();
        for(int i=1;i<=l;i++)
        {
           System.out.println(n+" * "+i+" = "+(n*i));  
        }
       
        sc.close();
    }
}

