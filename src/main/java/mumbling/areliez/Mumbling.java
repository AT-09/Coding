package mumbling.areliez;

public class Mumbling {

    public String accum(String word) {
        int length = word.length();
        String ini = "";
        for (int i = 0; i <= length; i++) {
            String character = String.valueOf(word.charAt(i));
            String guion = "-";
            int numberLeter = i++;
			ini = ini + accum(character, numberLeter, guion);
            String newWord = ini;
        }
        return newWord;
    }

    private String accum(String character, int numberLeter, String guion) {
        String word= "";
        for (int j = 1; j <= numberLeter; j++) {
            if (j==1) {
                String wordAccum = character.toUpperCase();
                word = word + wordAccum;
            } else {
                word = word + character.toLowerCase();
            }
        }return word + guion;
    }
}
