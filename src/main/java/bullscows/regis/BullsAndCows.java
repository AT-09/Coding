package java.bullscows.regis;
/**
 * Class: BullsAndCows
 *
 * It is game, its purpose game it is to guess the secret number. if you assert the number you will win, but if
 * you only assert of one of the element of the secret number you will get a Cow if number position is different or Bull if
 * position number is the same as secret number
 */
public class BullsAndCows {
    private int [] secretNumber;

    /**
     * BullsAndCows
     * Get the secret number and convert it to an array
     * @param secretNumber
     */
    public BullsAndCows (int secretNumber){
        this.secretNumber = convertToArrayInt(secretNumber);
    }
    /**
     *String Method: messageGame
     *
     *This method has the purpose to deliver a message about if the player guessed the secret number
     * this receive a number and call to another method like convertToArrayInt to convert that number to array
     * and finally to verify with assertBullsAndCows if the number is the same with the secret number.
     * If the number is not between of 1000 & 9999, it delivers a message error
     * @param possibleNumber
     * @return String
     */
    public String messageGame (int possibleNumber){
        if (possibleNumber > 999 && possibleNumber < 10000) {
            int[] arrayPossibleNumber = convertToArrayInt(possibleNumber);
            return assertsBullsAndCows(arrayPossibleNumber);
        } else {
            return "Please, send a number between 1000 and 9999";
        }
    }

    /**
     * Integer Method: convertToArrayInt
     *
     * This method has the purpose to convert a number in array, in this case of 4 elements
     * @param number
     * @return int []
     */
    private int [] convertToArrayInt (int number) {
        int[] arrayInt = new int[4];
        for (int index = 3; index > -1; index--) {
            int individualNumber = number % 10;
            arrayInt[index] = individualNumber;
            number = number/10;
        }
        return arrayInt;
    }

    /**
     * String Method: assertBullsAndCows
     *
     * This method deliver three message "You win!" and "#bulls bulls and #cows cows". the number of Bulls are the asserts that
     * had the user in the same position of the number and the number of cows are the asserts that had the user but in other position
     * If the user assert a the correct number, it will deliver You win!
     * @param possibleNumbers
     * @return String
     */
    private String assertsBullsAndCows (int [] possibleNumbers){
        int cows = 0;
        int bulls = 0;
        String message;
        for (int index = 0; index < secretNumber.length; index++) {
            if (possibleNumbers[index] == secretNumber[index]){
                bulls ++;
            } else {
                for (int i = 0; i < secretNumber.length; i++) {
                    if (possibleNumbers[index] == secretNumber[i]){
                        cows ++;
                    }
                }
            }
        }
        if (bulls == 4){
            message = "You win!";
        } else {
            message = bulls + " bulls and " + cows + " cows";
        }
        return message;
    }

    /**
     * Integer array: getSecretNumber
     * just return the array of the secret number
     * @return
     */
    public int[] getSecretNumber () {
        return secretNumber;
    }
}
