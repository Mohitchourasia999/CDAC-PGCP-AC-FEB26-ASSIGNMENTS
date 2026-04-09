public class scope {
    
    public static void main(String[] args) {
        
        // variable inside method
        int a = 10;
        System.out.println("method variable a = " + a);

        // loop scope
        for(int i = 1; i <= 3; i++)
        {
            int b = i * 10;   // variable inside loop
            System.out.println("loop variable b = " + b);
        }

        // System.out.println(b);   // error ---> b cannot be resolved to a variable (loop scope ended)

        // block scope
        {
            int c = 50;
            System.out.println("block variable c = " + c);
        }

        // System.out.println(c);  //error --> c cannot be resolved to a variable (block scope ended)

        // valid usage again
        System.out.println("method variable a again = " + a);
    }
}
