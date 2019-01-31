package mumbling;

public class Mumbling {

    public void enviarChar( String cadena ){
        for(int i = 0 ; i < cadena.length(); i++ ){
            mostrarCadenas( cadena.charAt(i) , i );
        }
    }
    public void mostrarCadenas( char letra , int position ){
        char aux;
        for(int i = 0 ; i < position + 1 ; i++){
            aux = ( i == 0 ) ? Character.toUpperCase(letra) : Character.toLowerCase(letra);
            System.out.print( "" + aux);
        }
        System.out.print(" ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Mumbling m = new Mumbling();
        m.enviarChar( "aBbc" );
    }
    
}
