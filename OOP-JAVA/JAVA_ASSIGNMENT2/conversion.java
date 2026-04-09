import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double salary=sc.nextDouble();

        // converting double type into int explicitly
        int conv=(int)salary;
        System.out.println(conv);

       // float f =salary;   // error ---> Type mismatch: cannot convert from double to float
        
        //System.out.println("from double to float"+f);
        sc.close();
    }
}
