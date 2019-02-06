import java.util.Scanner;

/*
this Main class executes the diagonal class
 */
public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String [] args){
        String value = "O";
        while (value != "S") {
            System.out.println("Write the side of you Matrix or write any letter to exit: ");
            value = input.nextLine();
            try {
                int side = Integer.parseInt(value);
                System.out.println(side);
                Diagonal example = new Diagonal();
                int[][] matrix = example.matrixRandom(side);
                example.printMatrix(matrix);
                System.out.println(example.messageDiagonalWin(matrix));
            }catch (Exception e){
                break;
            } 

        }
    }
}
