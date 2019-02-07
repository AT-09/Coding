package fighters.areliez;

public class Fight {
    public static String declaretWinner(Fighter figtherOne, Fighter fighterTwo) {
        String winerName = "";
        if (figtherOne.health < fighterTwo.health || figtherOne.health <= 0)
            winerName = figtherOne.name;
        else if(figtherOne.health > fighterTwo.health || fighterTwo.health <= 0)
            winerName = figtherOne.name;
        else if (figtherOne.health <= 0 && fighterTwo.health <= 0)
            winerName = "both lost";
        return winerName;
    }

    public static void startFigth(Fighter figtherOne, Fighter fighterTwo) {
        attakToFigther(fighterTwo,figtherOne);
        attakToFigther(figtherOne,fighterTwo);
    }

    private static void attakToFigther(Fighter victim, Fighter attacker) {
        victim.health = victim.health - attacker.damagePerAttack;
    }
}
