package baseline;

import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String word, String word2) {
        char[] firstWord = word.toLowerCase().toCharArray();
        char[] secondWord = word2.toLowerCase().toCharArray();

        Arrays.sort(firstWord);

        Arrays.sort(secondWord);

        return Arrays.equals(firstWord, secondWord);


        }
    }


