package baseline;

import java.util.Random;

public class NumberGame {
    public static int min;
    public static int max1;
    public static int max2;
    public static int max3;
    //Computer receives random number based on difficulty
    // The first level of difficulty is between 1 and 10.
    public static int difficulty1() {
        min = 1;
        max1 = 10;
        Random random = new Random();
        return random.nextInt(max1 - min) + min;
    }
    //The second difficulty is between 1 and 100.
    public static int difficulty2() {
        min = 1;
        max2 = 100;
        Random random = new Random();
        return random.nextInt(max2-min) + min;
    }
    //The third difficulty is between 1 and 1000.
    public static int difficulty3() {
        min = 1;
        max3 = 1000;
        Random random = new Random();
        return random.nextInt(max3 - min) + min;
    }

}
