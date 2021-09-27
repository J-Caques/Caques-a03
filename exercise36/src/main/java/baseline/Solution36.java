package baseline;

import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jonathan Caques
 */

public class Solution36 {
    private static List<String> dataArray;
    public static void main(String[] args) {
        //Statistics is important in our field.
        //When measuring response times or rendering times, it’s helpful to collect data so you can easily spot abnormalities.
        //For example, the standard deviation helps you determine which values are outliers and which values are within normal ranges.
        dataArray = new ArrayList<String>();
        String data = "0";

        //Write a program that prompts for response times from a website in milliseconds.
        //It should keep asking for values until the user enters “done.”
        while (!data.equals("done")){
            System.out.print("Enter a number: ");
            Scanner input = new Scanner(System.in);
            data = input.next();
            if(!data.matches("-?\\d+") && !data.equals("done")){
                System.out.print("Invalid input, only numeric data: ");
                    Scanner input2 = new Scanner(System.in);
                    data = input2.next();
            }
            if (!data.equals("done")) {
                dataArray.add(data);
            }
        }

        System.out.printf("Numbers:");
        for(int i = 0; i < dataArray.size(); i++){
            System.out.printf(" %s,", dataArray.get(i));
        }

        //Print the mean, minimum, maximum, and population standard deviation.
        Solution36 math = new Solution36();
        System.out.printf("%nThe average is %.1f%n", math.avg());
        System.out.printf("The minimum is %s%n", math.min());
        System.out.printf("The maximum is %s%n", math.max());
        System.out.printf("The standard deviation is %.2f%n", math.std());
    }
    public float avg(){
        int num, sum = 0;
        Object[] convert = dataArray.toArray();
        for(int i = 0; i < dataArray.size();i++ ){
           num = Integer.parseInt((String) convert[i]);
            sum += num;
        }
        float avg = (float)(sum/dataArray.size());
        return avg;
    }

    public int min() {
        int num;
        int[] numbers = new int[dataArray.size()];
        Object[] convert = dataArray.toArray();
        for (int i = 0; i < dataArray.size(); i++) {
            num = Integer.parseInt((String) convert[i]);
            numbers[i] = num;
        }
        Arrays.sort(numbers);
        return numbers[0];
    }

    public int max() {
        int num;
        int[] numbers = new int[dataArray.size()];
        Object[] convert = dataArray.toArray();
        for (int i = 0; i < dataArray.size(); i++) {
            num = Integer.parseInt((String) convert[i]);
            numbers[i] = num;
        }
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public float std(){
        int num;
        float sum = 0;
        Object[] convert = dataArray.toArray();
        int[] numbers = new int[dataArray.size()];
        for(int i = 0; i < dataArray.size();i++ ){
            num = Integer.parseInt((String) convert[i]);
            numbers[i] = num;
            sum += num;
        }
        sum = 0;
        float avg = (float)(sum/dataArray.size());
        for (int i = 0; i < dataArray.size(); i++){
            sum += Math.pow((numbers[i] - avg),2);
        }
            float var = sum/(dataArray.size());
            float std = (float)Math.sqrt(var);
            return std;
      }

    }
