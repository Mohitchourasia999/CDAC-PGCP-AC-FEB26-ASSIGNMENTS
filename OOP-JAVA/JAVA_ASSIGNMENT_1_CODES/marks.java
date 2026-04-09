import java.util.Scanner;
public class marks{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks you obtined in :");
         System.out.println("english: ");
         float e=sc.nextFloat();
          System.out.println("hindi: ");
          float h=sc.nextFloat();
           System.out.println("maths :");
           float m=sc.nextFloat();
            System.out.println("science :");
            float s=sc.nextFloat();
             System.out.println("java :");
             float j=sc.nextFloat();
             float total=e+h+m+s+j;
              System.out.println("total marks :"+total);
              float percent=(total*100)/500;
               System.out.println("percentage scored :"+percent);

               if(percent>=90)
                 System.out.println("grade= A");
                else if(percent>=80)
                     System.out.println("grade = A");
               else if(percent>=70)
                         System.out.println("grade = B");
                else if(percent>=60)
                             System.out.println("grade=C");
                else if(percent>=50)
                    System.out.println("grade = D");
                else
                    System.out.println("fail");            

           sc.close();             
    }
}