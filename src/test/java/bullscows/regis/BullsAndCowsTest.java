package java.bullscows.regis;
import org.junit.Test;

import static org.junit.Assert.*;

public class BullsAndCowsTest {

    @Test
    public void messageGame_Return2And1_WhenSent8091() {
        BullsAndCows actual = new BullsAndCows(9041);
        String expected = "2 bulls and 1 cows";
        assertEquals(expected, actual.messageGame(8091));
    }
    @Test
    public void messageGame_ReturnYouWin_WhenSent9041() {
        BullsAndCows actual = new BullsAndCows(9041);
        String expected = "You win!";
        assertEquals(expected, actual.messageGame(9041));
    }
    @Test
    public void messageGame_ReturnError_WhenSentStrangeNumber() {
        BullsAndCows actual = new BullsAndCows(9041);
        String expected = "Please, send a number between 1000 and 9999";
        assertEquals(expected, actual.messageGame(-15555));
    }
    @Test
    public void getArrayInt_ReturnArrayOfString_WhenSentANumberWith4Digits() {
        int [] expected = {1, 2, 3, 4};
        BullsAndCows actual = new BullsAndCows(1234);
        assertArrayEquals(expected, actual.getSecretNumber());
    }
}