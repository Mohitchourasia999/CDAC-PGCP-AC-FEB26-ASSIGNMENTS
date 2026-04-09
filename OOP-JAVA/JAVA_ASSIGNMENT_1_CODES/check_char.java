import java.util.Scanner;
public class check_char {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       char c=sc.next().charAt(0);
       int i=(int)c;
       char n=(char)(i+1);
       char p=(char)(i-1);
       System.out.println("next character="+n);
       System.out.println("previous character="+p);
       sc.close();
    }
    
}
