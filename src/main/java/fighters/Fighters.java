/**
 * Fighters
 * The purpose of this class is create fighters and establishes what of them is the
 * winner
 */
public class Fighters {
    private String name;
    private int health, damagePerAttack;
    public Fighters(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    /**Method declareWinner
     * This method returns the winner of the fight, calling to the method fightOfFighters
     * in order to get the champion, and finally the method catch the name of the champion
     * and send a message
     * @param fighterOne
     * @param fighterTwo
     */
    public static String declareWinner(Fighters fighterOne, Fighters fighterTwo){
        String winner = fightOfFighters(fighterOne,fighterTwo).name;
        return "Congratulations: " + winner;
    }

    /**fightOfFighters
     * This method establishes the winner doing a loop until one of them doesn't have
     * health. Every loop one of the fighters going to lose his health according to the
     * power of the damage of the opponent
     * @param fighterOne
     * @param fighterTwo
     * return the Fighter who won.
     */
    public static Fighters fightOfFighters(Fighters fighterOne, Fighters fighterTwo){

        boolean isFirstTurn = true;
        while (fighterOne.health > 0 && fighterTwo.health > 0){
            if (isFirstTurn){
                fighterOne.health -= fighterTwo.damagePerAttack;
                isFirstTurn = false;
            } else {
                fighterTwo.health -= fighterOne.damagePerAttack;
                isFirstTurn = true;
            }
        }
        return fighterOne.health > 0 ? fighterOne : fighterTwo;
    }
}