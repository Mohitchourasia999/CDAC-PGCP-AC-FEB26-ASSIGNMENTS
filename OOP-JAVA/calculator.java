import java.util.Scanner;
public class calculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers: ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.println("enter + for addition");
        System.out.println("enter - for substraction");
        System.out.println("enter / for division");
        System.out.println("enter % for mod");
        System.out.println("enter * for multiplication");
        System.out.println("now enter your choice among : + , - , * , / , %");
        char c=sc.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.println("addition = "+(a+b));
                break;

            case '-':
                System.out.println("substraction = "+(a-b));
                break;

            case '*':
                System.out.println("multiplication = "+(a*b));
                break;
                
            case '/':
                System.out.println("divison = "+(a/b));
                break;
                
            case '%':
                System.out.println("mod = "+(a%b));
                 break;

            default:
                System.out.println("you have enter a wrong choice");
        }
        sc.close();
        
    }
}
