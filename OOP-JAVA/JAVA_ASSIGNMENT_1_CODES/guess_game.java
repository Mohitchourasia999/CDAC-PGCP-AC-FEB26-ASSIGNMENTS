import java.util.Random;
import java.util.Scanner;
public class guess_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();                // random object
        int num=r.nextInt(100)+1;     // we use this because in random class "r.nextInt(100)+1;" this take random value between 1 to 100.
        while(true)
        {
            System.out.println("enter any number:- ");
        int guess=sc.nextInt(); 
        if(guess<num)
        {
            System.out.println("too low");                      // print too low if guess less than num
            System.out.println("match not found! enter again");
        }
        if(guess>num)
        {
            System.out.println("too high");                     // print too high if guess greater than num
            System.out.println("match not found! enter again");
        }
        if(guess==num)
        {
            System.out.println("correct! you guessed it");        // this print correct if guess == num.
            break;
        }
        }
        sc.close();                                            // this closes the input from the keyboard
    }
}
