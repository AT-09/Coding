import java.util.Scanner;
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
                example.print_matrix(matrix);
                int principal = example.addDiagonalMain(matrix);
                int secondary = example.addDiagonalSecondary(matrix);
                example.messageWinner(principal, secondary);
            }catch (Exception e){
                break;
            } 

        }
    }
}
