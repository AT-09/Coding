import static java.util.regex.Pattern.matches;

public class CreditCardIssuer { 

    public static void main(String[] args) {
        System.out.println(getIssuer(args[0]));
    }

    public static String getIssuer(String cn) {
        if (matches("^3[4|7].{13}$", cn)) return "AMEX";
        if (matches("^6011.{12}$", cn)) return "Discover";
        if (matches("^5[1-5].{14}$", cn)) return "Mastercard";
        if (matches("^4.{12}(...)?$", cn)) return "VISA";
        return "Unknown";
    }
  
}