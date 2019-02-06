package disemvowltrolls.areliez;

import disemvoweltrolls.areliez.Disemvowltrolls;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisemvowltrollsTest {

    @Test
    public void testOne() {
        Assert.assertEquals(Disemvowltrolls.removedVowels("Hola mundo"),"Hla mnd");
    }
}
