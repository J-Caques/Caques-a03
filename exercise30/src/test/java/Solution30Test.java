import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution30Test {
    @Test
    public void testforloops(){
        int [][] multiTable = new int[12][12];
        //Create nested for loop to create rows and columns
        for(int row = 0; row < 12; row++){
            for (int col = 0; col < 12; col++){
                //multiply rows and columns to fill table
                multiTable[row][col] = (row+1)* (col+1);
            }
        }
        for(int row = 0; row < 12; row++){
            System.out.print("\n");
            for (int col = 0; col < 12; col++){
                //multiply rows and columns to fill table
                System.out.printf("%6d  ", multiTable[row][col]);
            }
        }
        Assertions.assertAll(() -> assertEquals(121, multiTable[10][10]),
                             () -> assertEquals(45, multiTable[8][4]),
                             () -> assertEquals(42, multiTable[5][6]));
    }
}
