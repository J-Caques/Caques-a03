import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Solution37Test {
    @Test
    public void testRandomGenerators() {
        ArrayList<String> password = new ArrayList<String>();
        String[] specialChar = new String[]{"!", "#", "$", "%", "&", "'", "(", ")", "*", "+", "-", ".", "/", ":", ";", "<", "=", ">", "?", "@", "[", "]", "^", "_", "`", "{", "|", "}", "~"};
        String[] alphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random random = new Random();
        int mlength = 10;
        int special = 3;
        int numbers = 5;
        int length = getRandomValue(mlength, 20);
        Assertions.assertTrue(mlength<length&&length<=20);

        for(int i = 0; i<special;i++){
            int x = random.nextInt(specialChar.length);
            String y = specialChar[x];
            password.add(y);
            Assertions.assertTrue(0<x&&x<specialChar.length);
        }
        for( int j = 0;j<numbers;j++){
            int x = random.nextInt(10);
            String y = Integer.toString(x);
            password.add(y);
            Assertions.assertTrue(0<x&&x<10);
        }
        int letters = length - (numbers+special);
        Assertions.assertTrue((numbers+special)<letters);
        for(int n = 0; n<letters;n++){
            int x = random.nextInt(alphabet.length);
            String y = alphabet[x];
            password.add(y);
            Assertions.assertTrue(0<x&&x<alphabet.length);
        }


    }
    public static int getRandomValue(int Min, int Max)
    {

        // Get and return the random integer
        // within Min and Max
        return ThreadLocalRandom
                .current()
                .nextInt(Min, Max + 1);
    }
}


