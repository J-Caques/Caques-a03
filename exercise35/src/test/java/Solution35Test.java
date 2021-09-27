import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Solution35Test {
    @Test
    public void testRandomNumberGenerator(){
        String[] names = new String[]{"Michael", "Tim", "Laura", "Betty"};
        Random random = new Random();
        int x = random.nextInt(names.length);
        String winner = names[x];
        System.out.printf("The winner is ... %s%n", winner);
    Assertions.assertTrue(0<=x&&x<=names.length);
    }
}