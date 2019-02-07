package fighterstest.areliez;

import fighters.areliez.Fighter;
import fighters.areliez.Fight;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FighterTest {

    @Test
    public void testShowWinerName() {
        Fighter one = new Fighter("Paty", 30, 3);
        Fighter two = new Fighter("Miguel", 20, 5);
        Fight.startFigth(one,two);
        Assert.assertEquals(Fight.declaretWinner(one, two), "Paty");
    }
}
