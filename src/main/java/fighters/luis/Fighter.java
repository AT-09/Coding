package fighters;

public class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    public int attackForce(){
        int attach= (int) (Math.random() * 6);
        return 0;
    }
    public int diminishLifePoints(int attach){
        int pointsLife=health-attach;
        return pointsLife;
    }
    public boolean selectPlayStart(){
        boolean startPlayOne;
        int startPlay = (int) (Math.random() * 2);
        if(startPlay == 0){
            startPlayOne=true;
        }else{
            startPlayOne=false;
        }
        return startPlayOne;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        /*Fighter m = new Fighter();
        m.enviarChar( "aBbc" );*/
    }
}
