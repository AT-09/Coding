package java.bullscows.regis;

import java.util.Scanner;

/**
 * Main class
 * Execute the BullsAndCows class
 */
public class Main {
    static Scanner input = new Scanner(System.in);

    /**
     * Main
     * This method will execute the BullsAndCows Class and control the count of times of the player.
     * how many times the user get: 8
     * @param args
     */
    public static void main (String [] args){
        BullsAndCows player = new BullsAndCows(9041);
        int attempts = 8;
        String message = "You win!";
        while (attempts > 0) {
            System.out.println("Put a number of 4 digits and guess the secret number: ");
            try {
                int value = Integer.parseInt(input.nextLine());
                System.out.println(player.messageGame(value));
                if (message.equals(player.messageGame(value))){
                    break;
                }
            } catch (Exception e){
                System.out.println("Don't allow those characters");
            }
            attempts -- ;
        }
        System.out.println("Sorry, you're out of turns!");
    }
}
