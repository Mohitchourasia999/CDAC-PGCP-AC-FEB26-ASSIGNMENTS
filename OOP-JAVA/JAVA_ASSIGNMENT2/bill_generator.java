import java.util.Scanner;
public class bill_generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("--------GROCERY STORE BILL GENERATOR----------");
        System.out.println("Enter the number of items you want");
        int n=sc.nextInt();
        sc.nextLine();
        String item[]=new String[n];
        double price[]=new double[n];
        int qty[]=new int[n];
        double total[]=new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter item name:- ");
            item[i]=sc.nextLine();
            System.out.println("Enter price for "+item[i]+" :- ");
            price[i]=sc.nextDouble();
            System.out.println("Enter quantity you want for "+item[i]+" :- ");
            qty[i]=sc.nextInt();
            sc.nextLine();
            total[i]=price[i]*qty[i];
        }
        for(int i=0;i<n;i++)
        {
            if(total[i]>3000)
            {
                total[i]-=total[i]*0.1;
            }
        }
        System.out.println(
        String.format("%-15s %-10s %-10s %-10s","ITEM NAME"," PRICE ","QUANTITY"," TOTAL BILL(DISCOUNT 10% ABOVE 3000)"
        ));
        for(int i=0;i<n;i++)
{
    System.out.println(
        String.format("%-15s %-10s %-10s %-10s",
        item[i], price[i], qty[i], total[i])
    );
}
        sc.close();
    }
}
