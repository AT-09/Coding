package disemvoweltrolls.raul;

public class Disemvowel{
    public static void main(String[] args){
        String word = "log";
        String res = word.replaceAll("[aeiou]","");
        System.out.println("Deleting vowels: " + res);
    }
}