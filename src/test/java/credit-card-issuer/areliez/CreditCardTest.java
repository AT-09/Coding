package creditcardissuer.areliez;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditCardTest {

    @Test
    public void test1() {
        Assert.assertEquals(CreditCard.getIssuer("4111111111111111"),"VISA");
    }

    @Test
    public void test2() {
        Assert.assertEquals(CreditCard.getIssuer("4111111111111"),"VISA");

    }

    @Test
    public void test3() {
        Assert.assertEquals(CreditCard.getIssuer("4012888888881881"),"VISA");


    }

    @Test
    public void test4() {
        Assert.assertEquals(CreditCard.getIssuer("378282246310005"),"AMEX");

    }

    @Test
    public void test5() {
        Assert.assertEquals(CreditCard.getIssuer("6011111111111117"),"Discover");

    }

    @Test
    public void test6() {
        Assert.assertEquals(CreditCard.getIssuer("5105105105105100"),"Mastercard");

    }
    @Test
    public void test7() {
        Assert.assertEquals(CreditCard.getIssuer("5105105105105106"),"Mastercard");

    }
    @Test
    public void test8() {
        Assert.assertEquals(CreditCard.getIssuer("9111111111111111"),"Unknown");

    }
}
