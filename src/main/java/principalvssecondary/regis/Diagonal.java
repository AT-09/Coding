package principalvssecondary.regis;

import java.util.Random;

/*
    The Diagonal class creates a matrix with random numbers, print matrix and give us
    a message of the diagonal that wins.
 */
public class Diagonal {

    /*
    MatrixRandom
    It creates a matrix with random numbers, it accepts a number which is size of the matrix
     */
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

    /*
    messageDiagonalWin
    It gives an answer of what diagonal is bigger or if they are equal
     */
    public String messageDiagonalWin(int [][] matrix){
        int mainResult = 0;
        int secondaryResult = 0;
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix.length; y++) {
                if(x == y){
                    mainResult = mainResult + matrix[x][y];
                }
                int temp = x + y;
                if(temp == matrix.length-1){
                    secondaryResult = secondaryResult + matrix[x][y];
                }
            }
        }

        return mainResult > secondaryResult ? "Principal Diagonal win" : secondaryResult > mainResult ? "Secondary Diagonal Win" : "Draw";
    }

    /*
    printMatrix
    Just print every element of the matrix
     */

    public void printMatrix(int[][] matrix){
        for (int [] x: matrix) {
            System.out.println(" ");
            for (int y: x) {
                System.out.print(y + " ");
            }
        }
        System.out.println(" ");
    }
}
