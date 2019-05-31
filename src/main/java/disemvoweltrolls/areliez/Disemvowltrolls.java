package disemvoweltrolls.areliez;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Disemvowltrolls {

    public static String removeVowels(String sentence) {
        if (sentence.length()>0) {
            return removeAllVowels(sentence, 0);
        }
        return "Enter a sentence";
    }

    /**
     * Remove all vowels in the sentence.
     * @param sentence the sentence.
     * @param position the position to start a searching
     * @return a string without vowels.
     */
    private static String removeAllVowels(String sentence, int position) {
        String stringResult = "";
        for (int i = position; i < sentence.length(); i++) {
            String letter = String.valueOf(sentence.charAt(i));
            if (isVowel(letter)) {
                stringResult= stringResult;
            }
            else {
                stringResult = stringResult + letter;
            }
        }return stringResult;
    }

    /**
     * Verify if the letter is a uppercase or lowercase vowel.
     * @param letter the string to verify if is vowel.
     * @return true if letter is vowel, false otherwise false.
     */
    private static boolean isVowel(String letter) {
        Pattern vowelPattern = Pattern.compile("[aeiouAEIOU]");
        Matcher vowelMatcher = vowelPattern.matcher(letter);
        return vowelMatcher.find();
    }
}
