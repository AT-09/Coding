package mumbling;
public class Mumbling {
    /*
    Method that receives a string as parameter and decomposes it into characters. 
    */
    public void separateInChar( String word ){
        for(int i = 0 ; i < word.length(); i++ ){
            showString( word.charAt(i) , i );
        }
    }
    /*
    Method that receives as parameters a character and an integer that represents the position
    of the character in a string which serves to control the amount of repetitions.
    */
    public void showString( char letter , int position ){
        char aux;
        for(int i = 0 ; i < position + 1 ; i++){
            aux = ( i == 0 ) ? Character.toUpperCase(letter) : Character.toLowerCase(letter);
            System.out.print( "" + aux);
        }
        System.out.print(" ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Mumbling m = new Mumbling();
        m.separateInChar( "aBbc" );
    }
    
}
