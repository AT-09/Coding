/*
 *   This is a class for resolve
 *   to which back does a credit card number belong?
 *
 *
 **/

public class Main {
    public static void main(String[] args) {
        String [] numbertCards = {"4111111111111111", "4111111111111", "4012888888881881",
                "378282246310005", "6011111111111117", "5105105105105100", "5105105105105106",
                "9111111111111111"};
        for (String vendor: numbertCards) {
            printWhoVendor(vendor, getIssuer(vendor));
        }
    }
    private static String getIssuer(String cardNumber) {
        String namecard = "Unknow";
        int contNumber = cardNumber.length();
        if(contNumber == 13) {
            namecard = isCardVisa(cardNumber) ? "Visa" : "Unknow";

        } else {
            if (contNumber == 15) {
                namecard = isCardAmex(cardNumber) ? "Amex" : "Unknow";
            } else {
                if(contNumber == 16) {
                    if(isCardVisa(cardNumber)) {
                        namecard =  "Visa";
                    } else {
                        if(isCardDiscover(cardNumber)) {
                            namecard =  "Discover";
                        } else {
                            if(isCardMastercard(cardNumber)) {
                                namecard =  "Mastercard";
                            }
                        }
                    }
                }
            }
        }
        return namecard;
    }
    private static boolean isCardVisa(String stringNum) {

        int digfirst = Character.getNumericValue(stringNum.charAt(0));
        stringNum.charAt(0);
        return digfirst == 4;

    }
    private static boolean isCardAmex(String stringNum) {
        int digfirsts = Integer.parseInt(stringNum.substring(0, 2));
        return digfirsts == 34 || digfirsts == 37;
    }
    private static boolean isCardMastercard(String stringNum) {
        int digfirsts = Integer.parseInt(stringNum.substring(0, 2));
        return digfirsts == 51 || digfirsts == 52 || digfirsts == 53 || digfirsts == 54 ||digfirsts == 55;
    }
    private static boolean isCardDiscover(String stringNum) {
        int digfirsts = Integer.parseInt(stringNum.substring(0, 4));
        return digfirsts == 6011;
    }
    private static void printWhoVendor(String numberCar, String vendor) {
        System.out.println("This numer of card: " + numberCar + " is the bank: " + vendor);
    }
} 
 