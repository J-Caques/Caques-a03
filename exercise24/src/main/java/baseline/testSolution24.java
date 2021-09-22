package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testSolution24 {
    @Test
    public void testisAnagram(){
        assertTrue(AnagramCheck.isAnagram("word", "drow"));
        assertTrue(AnagramCheck.isAnagram("anagram", "gramana"));
        assertTrue(AnagramCheck.isAnagram("Style", "Yeslt"));
        assertFalse(AnagramCheck.isAnagram("Monkey", "Banana"));
        assertFalse(AnagramCheck.isAnagram("aaa", "a"));
        assertFalse(AnagramCheck.isAnagram("went", "far"));


    }
}

