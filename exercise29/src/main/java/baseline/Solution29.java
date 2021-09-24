package baseline;

import javax.naming.NameNotFoundException;
import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        //Prompt user for rate and save input
        System.out.print("What is the rate of return?: ");
            Scanner input = new Scanner(System.in);
            String rate = input.next();
        //While (rate == 0 || rate == letter)
        while (rate.equals("0") || rate.matches(".*[a-z].*") || Integer.parseInt(rate) < 0) {
            //Display "not valid input"
            System.out.println("Sorry that's not a valid input");
            //Prompt user for rate again
            System.out.print("What is the rate of return?: ");
                Scanner input2 = new Scanner(System.in);
                rate = input2.next();
        }
        //Calculate years using formula
        int r = Integer.parseInt(rate);
        int years = 72 / r;
        //Output total years
        System.out.printf("It will take %d years to double your initial investment.", years);

    }
}
