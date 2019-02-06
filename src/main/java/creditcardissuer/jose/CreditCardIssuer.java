package creditcardissuer.jose;

public class CreditCardIssuer {

    public static void main(String[] args) {
        System.out.println(getIssuer(args[0]));
    }

    public static String getIssuer(String cardNumber) {
        String cardType = "Unknown";
        if (cardNumber.length() == 15 &&
            (cardNumber.indexOf("34") == 0 ||
            cardNumber.indexOf("37") == 0)) {
            cardType = "AMEX";
        } else if (cardNumber.length() == 16 || 
            cardNumber.length() == 13) {
            if (cardNumber.indexOf("4") == 0) {
                cardType = "VISA";
            } else if (cardNumber.length() == 16) {
                if (cardNumber.indexOf("6011") == 0) {
                    cardType = "Discover";
                } else if (cardNumber.indexOf("51") == 0 ||
                    cardNumber.indexOf("52") == 0 ||
                    cardNumber.indexOf("53") == 0 ||
                    cardNumber.indexOf("54") == 0 ||
                    cardNumber.indexOf("55") == 0) {
                    cardType = "Mastercard";
                }
            }
        }
        return cardType;
    }
}