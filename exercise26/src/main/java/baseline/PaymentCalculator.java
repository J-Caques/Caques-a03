package baseline;
import java.lang.Math;
public class PaymentCalculator {
    public static double balance;
    public static double apr;
    public static double payment;
    public static int months;
    static float n;
    public static double i;

    public static int calculateMonthsUntilPaidOff() {
        i = 1 + ((apr / 100))/365;
        double bal = (balance * 1000) /0.5;
        int bl = (int) Math.ceil(bal);
        double b = bl / 1000d;

        double pay = (payment * 1000) /0.5;
        int py = (int) Math.ceil(pay);
        double p = pay / 1000d;

        double power = (b/p) * (1 - Math.pow(i, 30));
        double x = Math.log10(1 + power);
        double y = Math.log10(i);


        double n = (-(1.0000/30.0000) * x)/(y);


        months = (int) Math.ceil(n);
        return months;
    }

}
