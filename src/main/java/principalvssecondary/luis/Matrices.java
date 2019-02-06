package principalvssecondary.luis;

/**
 *
 * @author: Luis Guardia
 */
public class Matrices {

    int [][] matriz = {{2,4,4},{6,6,9},{18,10,12}};
    int diagonalPrincipal,diagonalSecundaria;
    
    public Matrices(){
        
    }
    
    public void sumarMatriz(){
        for (int x = 0; x < matriz.length; x++) {
            diagonalPrincipal += matriz[x][x];
            diagonalSecundaria += matriz[(matriz.length - 1) - x][x];
        }
        if(diagonalPrincipal > diagonalSecundaria)
            System.out.print("La diagonal principal es mayor: " + diagonalPrincipal);
        else{
            if(diagonalSecundaria > diagonalPrincipal)
                System.out.print("La diagonal secundaria es mayor: " + diagonalSecundaria);
            else
                System.out.print("La diagonal primaria y secundaria son iguales " + diagonalSecundaria);
        }
    }
    public static void main(String[] args) {
        Matrices m = new Matrices();
        m.sumarMatriz();
    }
    
}
