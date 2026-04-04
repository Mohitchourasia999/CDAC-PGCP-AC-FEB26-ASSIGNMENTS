import java.util.Scanner;
public class check_pos_neg {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         if(n>0)
         {
            System.out.println("positive");
         }
         if(n<0)
         {
             System.out.println("negative");
         }
         if(n==0){
             System.out.println("zero");}
            sc.close();
    }
    
}
