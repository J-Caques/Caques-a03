package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jonathan Caques
 */

/*
    "Enter a password: "
     String password = input.next();
     PasswordCheck.passwordValidator(password);
     passwordValidator():
        Finds if there's special char using Pattern & Matcher
        Finds the length of the string
        Counts number of letters & numbers
     Through series of if/else if statements:
        String strength = based on conditions (if password > or < 8, only #'s, etc.)
        Output:
        Your password "x" is a (strength) password."
 */

public class Solution25 extends PasswordCheck {
    public static void main(String[] args) {
        System.out.println("Type in a password to check its strength: ");
            Scanner input = new Scanner(System.in);
            String password = input.next();


        PasswordCheck.passwordValidator(password);
        
        System.out.printf("The password \"%s\" is a " + PasswordCheck.strength + " password.", password);
    }
}
