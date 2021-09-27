package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args) {
        //Arrays don’t have to be hard-coded.
        // You can take user input and store it in an array and then work with it.
        ArrayList<String> names = new ArrayList<String>();
        //Create a program that picks a winner for a contest or prize drawing.
        //Prompt for names of contestants until the user leaves the entry blank.
        String name = "0";
        int i = 0;
        while (!name.equals("")) {
            System.out.print("Enter a name: ");
            Scanner input = new Scanner(System.in);
            name = input.nextLine();
            if(!name.equals("")) {
                names.add(name);
            }
        }

        //Then randomly select a winner
        Random random = new Random();
        int x = random.nextInt(names.size());
        String winner = names.get(x);
        System.out.printf("The winner is ... %s%n", winner);
    }
}
