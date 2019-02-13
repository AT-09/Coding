package bullscows.areliez;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BullsCowsTest {

    @Test
    public void testMessageFor4bull0cows() {
        BullsCows bullsCows = new BullsCows(9401);
        Assert.assertEquals(bullsCows.compare(9041),"You win!");
    }

    @Test
    public void testMessageFor0bull0cows() {
        BullsCows bullsCows = new BullsCows(9401);
        Assert.assertEquals(bullsCows.compare(2356),"0 bulls and 0 cows");
    }

    @Test
    public void testMessageFor0bBullsSomeCows() {
        BullsCows bullsCows = new BullsCows(9401);
        Assert.assertEquals(bullsCows.compare(3956),"0 bulls and 1 cows");

    }
}
