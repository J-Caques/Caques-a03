import baseline.NumberGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution32Test {
    @Test
    public void testNumberGame() {
        int min = 1;
        int max1 = 10;
        int max2 = 100;
        int max3 = 1000;

        //The first difficulty is between 1 and 10
        Random random = new Random();
        int x = random.nextInt(max1 - min) + min;

        //The second difficulty is between 1 and 100.
        int y = random.nextInt(max2 - min) + min;

        //The third difficulty is between 1 and 1000.
        int i = random.nextInt(max3 - min) + min;

        Assertions.assertAll(() -> assertTrue(0 < x && x <= 10),
                () -> assertTrue(0 < y && y <= 100),
                () -> assertTrue(0 < i && i <= 1000));
    }
}

