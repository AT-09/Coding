package BullsCrows.raul;

import bullscows.raul.BullsCowsGame;
import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class BullsCowsGameTest {
    @Test
    public void testWinner() {
        BullsCowsGame raul = new BullsCowsGame(8091);
        assertEquals("You win!", raul.compareMatchesDigits(8901));
    }
}