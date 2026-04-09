import java.util.ArrayList;
import java.util.List;

public class payment_processing {

    public static void showpaymentdetails( List<? extends payment> list)
    {
        for(payment p:list)
        {
            p.displaypayment();
        }
    }
    public static void main(String args[]){
        ArrayList<creditcardpayment> list1=new ArrayList<>();
        list1.add(new creditcardpayment(101,2500.50,"credit card"));
         list1.add(new creditcardpayment(102,3999.00,"credit card"));
         list1.add(new creditcardpayment(103,1200.75,"credit card"));

          System.out.println("credit card payment details:- ");
         showpaymentdetails(list1);

          ArrayList<upipayment> list2=new ArrayList<>();
        list2.add(new upipayment(101,1500,"upi id"));
         list2.add(new upipayment(102,750,"upi id"));
         list2.add(new upipayment(103,2200,"upi id"));

           System.out.println("\nupi payment details:- ");
         showpaymentdetails(list2);
         
         
    }
}
class payment{
    int paymentid;
    double amount;
    payment(int id,double amt)
    {
          paymentid=id;
          amount=amt;
    }
    public void displaypayment()
    {
        System.out.println("\npayment id:- "+paymentid);
        System.out.println("amount:- "+amount);
    }
}
class creditcardpayment extends payment{
    String payment_using;
    creditcardpayment(int id , double amt , String payment_using)
    {
          super(id,amt);
         this.payment_using=payment_using;
    }

    public void displaypayment()
    {
       super.displaypayment();
       System.out.println("payment using:- "+payment_using);
    }
}
class upipayment extends payment{

    String payment_using;

    upipayment(int id , double amt , String payment_using)
    {
        super(id,amt);
        this.payment_using=payment_using;
    }
    public void displaypayment()
    {
        super.displaypayment();
        System.out.println("payment using:- "+payment_using);
    }
}

