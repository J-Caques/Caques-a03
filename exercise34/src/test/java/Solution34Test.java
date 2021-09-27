import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Solution34Test {
    @Test
    public void testEmployeeRemoval(){
        String[] employees = new String[]{"John Smith", "John Doe", "Jane Smith", "Jane Doe","Ronald McDonald"};
        String newList[] = new String[employees.length - 1];
        //
        Random random = new Random();
        int x = random.nextInt(5);
        String empName = employees[x];

        for (int i = 0, j = 0; i < 5; i++){
            if (!empName.equals(employees[i])){
                newList[j] = employees[i];
                j++;
            }
        }
        Assertions.assertEquals(employees.length-1, newList.length);
        Assumptions.assumeFalse(Arrays.asList(newList).contains(empName));
    }
}
