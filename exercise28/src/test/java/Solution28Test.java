import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Solution28Test {
    @Test
    public void testMain(){
        List<Integer> numbers = List.of(32, 5, 100, 60, 8);
            int sum = 0;
                for(int i = 0; i < 5; i++){
                   sum += numbers.get(i);
                }
        Assertions.assertEquals(205, sum);
    }

}
