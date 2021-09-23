

import baseline.PasswordCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class testSolutions25 {
    @Test
    public void testpasswordValidator(){
        List<String> passwords = List.of("123", "abc", "Jonathan", "01234567", "Tnt40", "$pecial77");
        String strength = null;
        PasswordCheck.passwordValidator(passwords.get(0));
            Assertions.assertEquals(PasswordCheck.strength = "very weak", PasswordCheck.strength);
        PasswordCheck.passwordValidator(passwords.get(1));
            Assertions.assertEquals(PasswordCheck.strength = "weak", PasswordCheck.strength);
        PasswordCheck.passwordValidator(passwords.get(2));
            Assertions.assertEquals(PasswordCheck.strength = "weak", PasswordCheck.strength);
        PasswordCheck.passwordValidator(passwords.get(3));
            Assertions.assertEquals(PasswordCheck.strength = "very weak", PasswordCheck.strength);
        PasswordCheck.passwordValidator(passwords.get(4));
            Assertions.assertEquals(PasswordCheck.strength = "strong", PasswordCheck.strength);
        PasswordCheck.passwordValidator(passwords.get(5));
            Assertions.assertEquals(PasswordCheck.strength = "very strong", PasswordCheck.strength);
    }

}
