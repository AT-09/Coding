import java.util.*;

public class Disemvowel_Trolls {

    /*<SUMARY>
       write a prayer and then remove only the vowels.
     */
    public static void main(String[ ] args) {
        java.util.Scanner date = new java.util.Scanner (System.in);
        System.out.print(" Ingrese las palabras : ");
        String name = date.nextLine();
        System.out.println("Palabra Sin Vocales : ");
        String resultWord = "";
        StringTokenizer tokens = new StringTokenizer(name, "aeiouAEIOU");

            while (tokens.hasMoreTokens()){
                resultWord += tokens.nextToken();
            }
        System.out.println(resultWord);
    }
}
