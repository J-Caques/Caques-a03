package baseline;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jonathan Caques
 */

/*
    Prompt User:
        "What is your balance? APR (%)? Monthly payment willing to make?"
    Using scanner to save inputs into variables:
        float balance, float apr, & float payment
    Create class PaymentCalculator w/ method calculateMonthsUntilPaidOff:
        Use Formula to calculate n months to pay off card:
            n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
            Round n to nearest int
    Output:
    It will take n months to pay off this card.
 */

public class Solution26 {

    public static void main(String[] args) {
        PaymentCalculator paymentcalculator = new PaymentCalculator();

        System.out.print("What is your balance?: ");
            Scanner input = new Scanner(System.in);
            paymentcalculator.balance = input.nextFloat();
        System.out.print("What is the APR on the card (%)?: ");
            Scanner input2 = new Scanner(System.in);
            paymentcalculator.apr = input2.nextFloat();
        System.out.print("How much are you willing to pay a month?: ");
            Scanner input3 = new Scanner(System.in);
            paymentcalculator.payment = input3.nextFloat();


        PaymentCalculator.calculateMonthsUntilPaidOff();
        System.out.printf("It will take you %d months to pay it off.", PaymentCalculator.months);
    }
}
