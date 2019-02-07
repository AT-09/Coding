import org.junit.Test;
import static org.junit.Assert.*;

public class FighterTest {

    /*
    the values are range is of 0 - 5
     */
    @Test
    public void strikeForce_ReturnValueAccepted_WhenChooseStrikeForce() {
        int expected = 2;
        int actual = Fighter.strikeForce(2);
        assertEquals(expected,actual);

    }

    /*
    the values are range is of winner player1, player 2 or draw
     */
    @Test
    public void fighterWinner_ReturnValueWinner_WhenVerifyTheLife() {
        String expected = "Draw!";
        String actual = Fighter.figtherWinner("Draw!");
        assertEquals(expected,actual);
    }

}