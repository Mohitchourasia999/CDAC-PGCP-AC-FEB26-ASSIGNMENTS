import java.util.Scanner;
public class ascii {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       char c=sc.next().charAt(0);
       System.out.println("ascii="+((int)c));
       sc.close();
    }
    
}
