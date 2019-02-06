package disemvoweltrolls.areliez;

public class Disemvowltrolls {

    public static String removedVowels(String sentence) {
        if (sentence.length()>0) {
            return removedVowels(sentence, 0);
        }
        return "the sentence is short";
    }

    private static String removedVowels(String sentence, int position) {
        String stringResult = "";
        for (int i=0;i<= sentence.length();i++) {
            char character = sentence.charAt(i);
            if (isVowel(character)) {
                stringResult= stringResult + sentence.replace(character,'+');
            }
            else {
                stringResult = stringResult + character;
            }
        }return stringResult;
    }

    private static boolean isVowel(char character) {
        if (character == 'a' || character == 'A');
        return true;
    }


}
