import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution31Test {
    @Test
    public void testwhileloop(){
        float targetHeartRate[] = new float[9];
        int i = 0;
        int age = 22;
        int rhr = 65;
        while (i < 8) {
            for (int x = 55; x < 96; x += 5) {
                float intensity = (float) x / 100;
                targetHeartRate[i] = (((220 - age) - rhr) * intensity) + rhr;
                i++;
            }

        }
        Assertions.assertEquals(151, Math.round(targetHeartRate[2]));
    }
}
