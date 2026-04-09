import java.util.Scanner;
public class vowel {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any character to check whether it is a vowel or consonant:");
        char c=sc.next().charAt(0);
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            System.out.println("entered character is vowel");
        else
            System.out.println("entered character is consonant");
        sc.close();

    }
    
}
