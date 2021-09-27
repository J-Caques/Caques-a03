package baseline;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        //When you loop, you can control how much you increment the counter; you don’t always have to increment by one.
        //
        //When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself.
        // The Karvonen heart rate formula is one method you can use to determine your rate.
        // Create a program that prompts for your age and your resting heart rate.
        float targetHeartRate[] = new float[9];
        int i = 0;
        System.out.print("What is your age?: ");
            Scanner input = new Scanner(System.in);
            int age = input.nextInt();
        System.out.print("What is your resting heart rate?: ");
            Scanner input2 = new Scanner(System.in);
            int rhr = input2.nextInt();

        // Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%.
        while (i < 8) {
            for (int x = 55; x < 96; x += 5) {
                float intensity = (float) x / 100;
                targetHeartRate[i] = (((220 - age) - rhr) * intensity) + rhr;
                i++;
            }
        }
        i = 0;
        int intensity = 55;
        // Generate a table with the results as shown in the example output.
        System.out.printf("Resting pulse: %d", rhr);
        System.out.printf("\t\tAge: %d%n", age);
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
        for(int row = 0; row<9; row++) {
            System.out.printf("%d\t\t\t | %d bpm%n", intensity, Math.round(targetHeartRate[i]));
            i++;
            intensity+=5;

        }
    }
}
