package bullscows.raul;


public class BullsCowsGame {
    private int numberTurns, numberSecret;
    public BullsCowsGame(int numSecret) {
        numberTurns = 8;
        numberSecret = numSecret;
    }
    public String compareMatchesDigits(int tryWithNumber) {
        String message = "";
        numberTurns --;
        if (tryWithNumber == numberSecret) {
            message = "You win!";
        } else {
            message = bullsCowsMaches(tryWithNumber);
        }
        return message;
    }
    private String bullsCowsMaches(int numberToTest) {
        int countBulls = 0;
        int countCrows = 0;
        String messagesBullsCrows = "";
        String numberSecretAsString =  Integer.toString(numberSecret);
        String numberToTesttAsString =  Integer.toString(numberToTest);
        if (numberToTesttAsString.length() != 4) {
            messagesBullsCrows = "This number not is valid: " + numberToTest;
        } else {
            for (int i = 0; i < numberToTesttAsString.length() ; i ++) {
                if(numberToTesttAsString.charAt(i) == numberSecretAsString.charAt(i)) {
                    countBulls ++;
                } else {
                    String dogitAsString = String.valueOf(numberToTesttAsString.charAt(i));
                    if (numberSecretAsString.contains(dogitAsString)) {
                        countCrows ++;
                    }
                }
            }
        }
        return messagesBullsCrows(countBulls, countCrows);

    }
    private String messagesBullsCrows(int nunBulls, int numCrows) {
        String message = "";
        if ((nunBulls > 1) && (numCrows > 1) ) {
            message = nunBulls + " Bulls and " + numCrows + " Crows.";
        } else {
            if ((nunBulls > 1) && (numCrows < 2) ) {
                message = nunBulls + " Bulls and " + numCrows + " Crow.";
            } else {
                if ((nunBulls < 2) && (numCrows > 1) ) {
                    message = nunBulls + " Bull and " + numCrows + " Crows.";
                } else {
                    message = nunBulls + " Bull and " + numCrows + " Crow.";
                }
            }
        }
        return message;
    }
}