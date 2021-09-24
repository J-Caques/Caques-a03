package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jonathan Caques
 */


public class Solution30 {
    public static void main(String[] args) {
        //Create 2D array that's 12x12
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
    }
}
