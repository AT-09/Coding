import java.util.Random;
public class Diagonal {

    public int [][] matrixRandom(int side){
        int [][] matrix = new int [side][side];
        Random numRand =  new Random();
        for (int x = 0; x < side; x++) {
            for (int y = 0; y < side; y++) {
                matrix[x][y] = numRand.nextInt(9) + 1;
            }
        }
        return matrix;
    }

    public int addDiagonalMain(int [][] matrix){
        int result = 0;
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix.length; y++) {
                if(x == y){
                    result = result + matrix[x][y];
                }
            }
        }
        System.out.println("Diagonal Main: " + result);
        return result;
    }

    public int addDiagonalSecondary(int [][] matrix){
        int result = 0;
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix.length; y++) {
                int temp = x + y;
                if(temp == matrix.length-1){
                    result = result + matrix[x][y];
                }
            }
        }
        System.out.println("Diagonal Secondary: " + result);
        return result;
    }

    public void messageWinner(int resultMain , int resultSecondary){
        String message;
        if (resultMain  >  resultSecondary) {
            message = "Principal Diagonal win!";
        }
        else {
            message = "Secondary Diagonal win!";
        }
        if(resultMain  == resultSecondary){
            message = "Draw!";
        }
        System.out.println(message);
        //return message;
    }

    public void print_matrix(int[][] matrix){
        for (int [] x: matrix) {
            System.out.println(" ");
            for (int y: x) {
                System.out.print(y + " ");
            }
        }
        System.out.println(" ");
    }
}
