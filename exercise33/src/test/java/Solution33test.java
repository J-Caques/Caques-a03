import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution33test {
    @Test
    public void testRandomNumberGenerator(){
        String[] stringArray = new String[]{"Yes", "No", "Maybe", "Ask again later."};
       for(int x = 0; x<100; x++) {
           Random random = new Random();
           int i = random.nextInt(4);
           System.out.println(stringArray[i]);
           Assertions.assertTrue(0 <= i && i <= 3);
       }
    }
}
