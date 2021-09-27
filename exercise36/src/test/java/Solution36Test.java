import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Solution36Test {
    @Test
    public void testAvgFunction(){
        List<String> dataArray = List.of("900", "100", "500","300");
        int num, sum = 0;
        Object[] convert = dataArray.toArray();
        for(int i = 0; i < dataArray.size();i++ ){
            num = Integer.parseInt((String) convert[i]);
            sum += num;
        }
        float avg = (float)(sum/dataArray.size());
        System.out.println(avg);
        Assertions.assertEquals(450, avg);
    }

    @Test
    public void testMinFunction(){
        List<String> dataArray = List.of("900", "100", "500","300");
        Object [] convert = dataArray.toArray();
        int[] numbers = new int[dataArray.size()];
        int num = 0;
        for (int i = 0; i < dataArray.size(); i++) {
            num = Integer.parseInt((String) convert[i]);
            numbers[i] = num;
        }
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        Assertions.assertEquals(100, numbers[0]);
    }

    @Test
    public void testMaxFunction(){
        List<String> dataArray = List.of("900", "100", "500","300");;
        int num;
        int[] numbers = new int[dataArray.size()];
        Object[] convert = dataArray.toArray();
        for (int i = 0; i < dataArray.size(); i++) {
            num = Integer.parseInt((String) convert[i]);
            numbers[i] = num;
        }
        Arrays.sort(numbers);
        System.out.println(numbers[dataArray.size()-1]);
        Assertions.assertEquals(900, numbers[dataArray.size()-1]);
    }

    @Test
    public void testStdFunction(){

        List<String> dataArray = List.of("900", "100", "500","300");
        int num;
        float sum = 0;
        Object[] convert = dataArray.toArray();
        int[] numbers = new int[dataArray.size()];
        for(int i = 0; i < dataArray.size();i++ ){
            num = Integer.parseInt((String) convert[i]);
            numbers[i] = num;
            sum += num;
        }
        float avg = (float)(sum/dataArray.size());
        sum = 0;
        for (int i = 0; i < dataArray.size(); i++){
            sum += Math.pow((numbers[i] - avg),2);
        }
        System.out.println(sum);
        float var = sum/(dataArray.size());
        float std = (float)Math.sqrt(var);
        System.out.println(std);
        Assertions.assertEquals(296, Math.round(std));
    }
}
