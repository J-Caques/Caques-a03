import baseline.PaymentCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testSolution26 {
    @Test
    public void testcalculateMonthsPaidOff() {
        PaymentCalculator.balance = 5000.253;
        PaymentCalculator.payment = 300.321;
        PaymentCalculator.apr = 23;
        PaymentCalculator.calculateMonthsUntilPaidOff();
        Assertions.assertEquals(21, PaymentCalculator.months);
    }
}
