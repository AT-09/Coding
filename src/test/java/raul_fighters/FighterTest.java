package raul_fighters;

import fighters.raul.Fighter;
import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class FighterTest {
    @Test
    public void testWinner() {
        Fighter rock = new Fighter("The Rock", 10, 10);
        Fighter brock = new Fighter("Brock Lesnar", 10, 5);
        int damageRock = rock.damagePerAttack;
        rock.attack(damageRock, brock);
        if (brock.health <= 0) {
            assertEquals("The Rock", rock.name);
        }
    }
}
