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
        for (int i=0;i < sentence.length();i++) {
            String character = String.valueOf(sentence.charAt(i));
            if (isVowel(character)) {
                stringResult= stringResult;// + sentence.replace(character,'+');
            }
            else {
                stringResult = stringResult + character;
            }
        }return stringResult;
    }

    private static boolean isVowel(String character) {
        String vowelA = "A";
        String vowela = "a";
        String vowele = "e";
        String vowelE = "E";
        String voweli = "i";
        String vowelI = "I";
        String vowelO = "O";
        String vowelo = "o";
        String vowelU = "U";
        String vowelu = "u";
        if (character.equals(vowelA) || character.equals(vowela) || character.equals(vowelE)) {
        return true;
        } else return false;
    }


}
