package baseline;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {

    public static String strength = null;

    public static boolean passwordValidator(String password) {
        int numCount = 0;
        int alpaCount = 0;
        int specCount = 0;
        int length = password.length();

        Pattern pPattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher pMatcher = pPattern.matcher(password);



        for (int i = 0; i < length; i++) {
            if ((Character.isLetter(password.charAt(i)) == true)) {
                alpaCount++;
            }
            if ((Character.isDigit(password.charAt(i)) == true)) {
                numCount++;
            }

        }
        if (pMatcher.matches()) {
            if (password.length() < 8 && alpaCount == 0) {
                strength = "very weak";
            } else if (password.length() < 8 && numCount == 0) {
                strength = "weak";
            } else if (password.length() >= 8 && alpaCount >= 1 && numCount >= 1) {
                strength = "strong";
            }
        }
        else if(password.length()>=8 && alpaCount >=1 && numCount >=1) {
            strength = "very strong";
        }
        return false;
    }

}





