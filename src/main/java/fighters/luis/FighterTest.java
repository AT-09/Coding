/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fighters;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class FighterTest {
    
    Fighter f=new Fighter("Play 1",50,5);
    public FighterTest() {
    }
    @Test
    public void testAttackForce() {
        int expResult = 0;
        int result = f.attackForce();
        assertEquals(expResult, result);
    }
    @Test
    public void diminishLifePoints() {
        int expResult = 45;
        int result = f.diminishLifePoints(5);
        assertEquals(expResult, result);
    }
    @Test
    public void test_startPlayOne_true() {
        boolean expResult = true;
        boolean result = f.selectPlayStart();
        assertEquals(expResult, result);
    }
    @Test
    public void test_startPlayOne_false() {
        boolean expResult = true;
        boolean result = f.selectPlayStart();
        assertEquals(expResult, result);
    }
    /**

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Fighter.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
