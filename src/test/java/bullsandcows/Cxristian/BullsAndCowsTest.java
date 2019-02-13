
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BullsAndCowsTest {

    /*
    *   this test case search the quantity of bulls
    */
    @Test
    public void countBulls_returnCountBulls1_whenVerifyTheNumbers()
    {
        BullsAndCows hiddenNumber = new BullsAndCows("2346");
        BullsAndCows numberTry = new BullsAndCows("0145",1);
        assertEquals(BullsAndCows.returnCountBulls(hiddenNumber,numberTry), 1);
    }

    /*
     *   this test case search the quantity of Cows
     */
    @Test
    public void countCows_returnCountCows0_whenVerifyTheNumbers()
    {
        BullsAndCows hiddenNumber = new BullsAndCows("2346");
        BullsAndCows numberTry = new BullsAndCows("0145");
        assertEquals(BullsAndCows.returnCountCows(hiddenNumber, numberTry), 0);
    }

    /*
     *   this test case returns the result of the game when win de game
     */
    @Test
    public void verifyNumber_returnResultWin_whenResultWin()
    {
        BullsAndCows hiddenNumber = new BullsAndCows("2346");
        BullsAndCows numberTry = new BullsAndCows("2346",7);
        assertEquals(BullsAndCows.verifyNumberResult(hiddenNumber, numberTry), "You win!");
    }

    /*
     *   this test case returns the result of the game when lose game
     */
    @Test
    public void verifyNumber_returnResultWin_whenResultLose()
    {
        BullsAndCows hiddenNumber = new BullsAndCows("2346");
        BullsAndCows numberTry = new BullsAndCows("2346",9);
        assertEquals(BullsAndCows.verifyNumberResult(hiddenNumber, numberTry), "Sorry, you're out of turns!");
    }
}