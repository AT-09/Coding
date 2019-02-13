package bullscows.areliez;

public class BullsCows {

    private int number;
    private int bulls = 0;
    private int cows = 0;

    public BullsCows(int number) {
        this.number = number;
    }

    public String compare(int numberToCompare) {
        String messageResult = "";
        for (int i = 1 ; i <= 4; i++) {
            int digitOfNumber = getDigit(number);
            number = number/10;
            int digitToCompare = getDigit(numberToCompare);
            numberToCompare = numberToCompare/10;
            if (digitOfNumber == digitToCompare) {
                bulls = bulls + 1;
            } else {
                cows = exitCows(number,digitToCompare);
            }
        }
        if (bulls == 4 && cows == 0) {
            messageResult = "You win!";
        } else if (bulls == 0 && cows == 0) {
            messageResult = "0 bulls and 0 cows";
        } else if (bulls >= 1 && cows >= 1) {
            String messageOne = bulls + " bulls and " + cows +" cows";
            messageResult = messageOne;
        }
        return messageResult;
    }

    private int getDigit(int number) {
        int digit = number % 10;
        return digit;
    }

    /**
     * Return the cows of number
     * @param number number
     * @param digitToCompare the digit to compare on number
     * @return the cant of cows that exist in number
     */
    private int exitCows(int number, int digitToCompare) {
        int cantDigitOfNumber = 0;
        int aux = number;
        while(aux % 10 != 0) {
            aux = aux/10;
            cantDigitOfNumber = cantDigitOfNumber + 1;
        }
        for (int i = 1 ; i <= aux; i++) {
            int digitOfNumber = getDigit(number);
            if (digitOfNumber == digitToCompare) {
                cows = cows + 1;
            } else {
                cows = cows;
            }
        }
         return cows;
    }
}
