public class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static int strikeForce(int strike){
        int damagePerAttack = (int)(Math.random()*5);
        return damagePerAttack;
    }

    public static String figtherWinner(String Winner){
        int x = 0,y = 0;
        int totalLife1 = 10, totalLife2 = 10;

        Fighter fighter01 = new Fighter("Juan",totalLife1,x);
        Fighter fighter02 = new Fighter("Coco",totalLife2,y);

        do {
            x = strikeForce(x);
            y = strikeForce(y);
            totalLife1 = totalLife1 - y;
            totalLife2 = totalLife2 - x;
        }while (totalLife1 > 0 && totalLife2 > 0);

        if (totalLife1 > totalLife2) {
            return "Win! Player 1 : " + fighter01.name;
        } else if(totalLife1 < totalLife2) {
            return "Win! Player 2 : " + fighter02.name;
        }
        return "Draw!";
    }
}
