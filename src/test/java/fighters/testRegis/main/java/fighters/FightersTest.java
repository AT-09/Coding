package main.java.fighters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FightersTest {

    @Test
    void declareWinner_ReturnWinner_WhenSendFighters() {
        Fighters fighterOne = new Fighters("Enrique", 100, 20);
        Fighters fighterTwo = new Fighters("Regis", 100, 50);
        String actual = Fighters.declareWinner(fighterOne,fighterTwo);
        String expect = "Congratulations: Regis";
        assertEquals(actual,expect);
    }
    @Test
    void fightOfFighters_ReturnsFighterWinner_WhenSendFighters(){
        Fighters fighterOne = new Fighters("Enrique", 100, 20);
        Fighters fighterTwo = new Fighters("Regis", 100, 50);
        Fighters actual = Fighters.fightOfFighters(fighterOne,fighterTwo);
        assertEquals(fighterTwo, actual);
    }
}