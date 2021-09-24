import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Solution29Test {
    @Test
    public void whileloop() {

        int count = 0;
        int rate[] = new int[]{0, 1, 100, 5, 2, -10};
        String rte[] = new String[]{"a", "bb", "sgdg", "q"};
        for (int i = 0; i < rate.length; i++) {
            while (rate[i] == 0 || rate[i] < 0) {
                //Display "not valid input"
                System.out.println("Sorry that's not a valid input");
                count++;
                break;
            }

        }
        for (int x = 0; x < rte.length; x++) {
            while (rte[x].matches(".*[a-z].*")) {
                System.out.println("Sorry that's not a valid input");
                count++;
                break;
            }
        }
        Assertions.assertEquals( 6, count);
    }
}
