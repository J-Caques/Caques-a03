package baseline;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {
        //initialize variable sum
        int sum = 0;
        //Create for loop that repeats 5 times
        for(int i = 0; i < 5; i++){
            //prompt user for a number
            System.out.print("Enter a number: ");
                Scanner input = new Scanner(System.in);
                //save input into variable number
                int number = input.nextInt();
                //add the value of number to sum
                sum += number;
        }
        //Output the sum
        System.out.printf("The total is " + sum + ".");
    }


}
