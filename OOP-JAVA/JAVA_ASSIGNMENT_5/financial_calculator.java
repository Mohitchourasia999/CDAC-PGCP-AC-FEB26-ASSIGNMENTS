public class financial_calculator {
    public static void main(String[] args) {
        
    

    Integer arr[]={100,200,300,450,250};

    finance<Integer> f =new finance<Integer>();
    
    System.out.println("transactions total and average:- ");
    f.Sum(arr);
    f.display();

    
    Double sal[]={45000.0,52000.5,61000.75};

    finance<Double> f1=new finance<>();

     System.out.println("salaries total and average:- ");
    f1.Sum(sal);
    f1.display();
}
}
class finance<T extends Number>{
double total=0;
double avg=0;
   void Sum(T a[])
   {
          for(T i:a)
          {
            total+=i.intValue();
          }
          avg=total/a.length;
   }

   void display()
   {
      System.out.println("sum="+total);
      System.out.println("average="+avg);
   }
}

