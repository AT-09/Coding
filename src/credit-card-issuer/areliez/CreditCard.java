
public class CreditCard {

    public static String getIssuer(String creditNumber) {
        String issuer = "Unknown";
        if (isVisa(creditNumber))
            issuer = "VISA";
        else if(isAmex(creditNumber))
            issuer = "AMEX";
        else if(isDiscovery(creditNumber))
            issuer = "Discover";
        else if (isMastercard(creditNumber))
            issuer = "Mastercard";
        return issuer;
    }

    /**
     * Checks weather provided credit number is a Mastercard.
     * @param creditNumber the credit number.
     * @return true if the credit number is Mastercard, otherwise false.
     */
    private static boolean isMastercard(String creditNumber) {
        int lengthCreditCard = creditNumber.length();
        if (lengthCreditCard == 16)
            return (creditNumber.startsWith("51") ||
                    creditNumber.startsWith("52") ||
                    creditNumber.startsWith("53") ||
                    creditNumber.startsWith("54") ||
                    creditNumber.startsWith("55"));

        return false;
    }

    private static boolean isDiscovery(String creditNumber) {
        if (creditNumber.length() == 16) {
            return creditNumber.startsWith("6011");
        }
        return false;
    }

    private static boolean isAmex(String creditNumber) {
        if (creditNumber.length() == 15) {
            return creditNumber.startsWith("34") || creditNumber.startsWith("37");
        }
        return false;
    }

    private static boolean isVisa(String creditNumber) {
        int lengthCreditCard = creditNumber.length();
        if (creditNumber.length() == 13 || lengthCreditCard == 16) {
            return creditNumber.startsWith("4");
        }
        return false;
    }
}
