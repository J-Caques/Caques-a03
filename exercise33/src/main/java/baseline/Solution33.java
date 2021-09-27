package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        //Arrays are great for storing possible responses from a program.
        // If you combine that with a random number generator,
        // you can pick a random entry from this list, which works great for games.
        // and then displays either
        //Create an array that holds list of responses
        String[] stringArray = new String[]{"Yes", "No", "Maybe", "Ask again later."};

        //Prompt for a question
        System.out.printf("What's your question?%n>");
            Scanner input = new Scanner(System.in);
            String question = input.next();

        //Create a random number generator, save to variable i;
        Random random = new Random();
        int i = random.nextInt(4);

        //Print out random response;
        System.out.printf("%s", stringArray[i]);


    }
}
