/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bullsandcows;

/**
 *
 * @author Admin
 */
public class BullsAndCows {
    private int numberGeneratedRandom ;
    private int numberSelected;
    private int numberOfAttempts;
    boolean youGuessedNumber = false;
    public BullsAndCows( int numberGeneratedRandom , int numberOfAttempts) {
        this.numberGeneratedRandom = numberGeneratedRandom ;
        this.numberOfAttempts = numberOfAttempts;      
    }
    /**
     * Metodo que inicia el juego 
     */
    public void startGame(){
        for(int i = 0 ; i < numberOfAttempts ; i++ ){
            int numberRandomPlayer = (int) (Math.random() * 8999) + 1000;
            System.out.println( " Number selected by the player: " + numberRandomPlayer );
            numberSelected = numberRandomPlayer ;
            System.out.println( " Results of attempt number " + i );
            if( numberSelected == numberGeneratedRandom ) {
                System.out.println( "You win!" );
                
                youGuessedNumber = true;
            }
            else{
                if( !youGuessedNumber ){
                    int numberOfBullsFound = checkNumberOfBulls( numberGeneratedRandom , numberSelected );
                    checkNumberOfCows( numberGeneratedRandom , numberSelected );
                    System.out.println( " The number of bulls founds is: " + numberOfBullsFound );
                }
            }
        }
    }
    /**
     * Method that shows Bulls' candor for every attempt
     */
    public int checkNumberOfBulls( int numberGenerateRandom , int numberSelectedPlay ){
        int numberOfBullsFound = 0 ;       
        int numberPlayer = numberSelectedPlay;
        int numberGenerateComputer = numberGenerateRandom;
        for( int i = 0; i < 4 ; i++ ){
            if( i < 3 ){
                if( numberGenerateComputer % 10 == numberPlayer % 10 ){
                    numberOfBullsFound ++ ;
                    numberGenerateComputer /= 10 ;
                    numberPlayer /= 10 ;
                }else{
                    numberGenerateComputer /= 10 ;
                    numberPlayer /= 10 ;
                }
            } 
            if( i == 3 ){
                if( numberGenerateComputer == numberPlayer ) {
                    numberOfBullsFound ++ ;
                }
            }
        }
        return numberOfBullsFound;
    }
    /**
     * Method that shows Cows candor for every attempt
     */
    public void checkNumberOfCows( int numberGenerateRandom , int numberSelectedPlay ){
        
    }
    
    /**
     * Metodo que devuelve un numero aleatorio para el jugador que esta participando
     * 
     */
    public int chooseNumber(){
        return numberSelected;
    }
    /**
     * @param args the command line arguments
     */
    public static void main( String[] args) {
        int numberRandom = (int) (Math.random() * 8999) + 1000;
        System.out.println( "Number selected by the computer: " + numberRandom );
        BullsAndCows game = new BullsAndCows( numberRandom , 8 );
        game.startGame();
    }
    
}
