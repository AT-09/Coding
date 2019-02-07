package main.java.disemvoweltrolls.Regis;

/*
    DisemvowelTrolls

    This class does that the phrase loses its vowels and returns only the phases with
    only consonant

 */
public class Disemvowel {
    /*
        This method only runs the purpose of the Disemvowel class
     */
    public static void main (String args []){
        String task = "This website is for losers LOL!";
        System.out.println(disemvowel(task));
    }
    /*
        This method take a phrase and check letter by letter of the phrase if exists
        vowels. If vowels exist the String builder isn't going to include to the new phrase.
     */
    private static String disemvowel(String phrase){
        char [] lowerVowels = {'a', 'e', 'i', 'o' , 'u'};
        char [] upperVowels = {'A', 'E', 'I', 'O' , 'U'};
        StringBuilder messageModify = new StringBuilder();
        boolean flag = true;
        for (int index = 0; index < phrase.length(); index++) {
            for (int i = 0; i < 5; i++) {
                if(phrase.toCharArray()[index] == lowerVowels[i] || phrase.toCharArray()[index] == upperVowels[i]){
                    flag = !flag;
                }
            }
            if(flag) {
                messageModify.append(phrase.toCharArray()[index]);
            }else{
                flag = !flag;
            }
        }
        return messageModify.toString();
    }
}
