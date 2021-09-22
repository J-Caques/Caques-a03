package baseline;

import  java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jonathan Caques
 */

/*  Prompt User
    Enter first String:
    Enter second String:
    Run words into isAnagram function
        convert string into lowercase;
        cast strings to chars and input them into two char[] arrays
        sort each array alphabetically using Arrays.sort
        Compare the strings using Arrays.equals
    If isAnagram returns true:
        "x" and "y" are anagrams.
    else:
        "x" and "y" are not anagrams.
 */

public class Solution24 {
    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they're anagrams");
        System.out.print("Enter the first string: ");
            Scanner input1 = new Scanner(System.in);
            String word = input1.next();
        System.out.print("Enter the second string: ");
            Scanner input2 = new Scanner(System.in);
            String word2 = input2.next();


        if(AnagramCheck.isAnagram(word, word2)){
            System.out.printf("\"%s\" and \"%s\" are anagrams. %n", word, word2);
        }
        else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams. %n", word, word2);
        }



    }


}


