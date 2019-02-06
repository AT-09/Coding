package principalvssecondary.cxristian;

import java.util.Scanner;

public class Matriz_Cuadrada {
    private Scanner keyboard;
    private int[][] mat;
    int[] diagoPrincipal;
    int[] diagoSecundaria;
    int suma1 = 0, suma2 = 0;

    public static void main(String[] ar) {
        Matriz_Cuadrada ma=new Matriz_Cuadrada();
        //ma.uploadNumbers();
        ma.uploadNumbersRandom();
        ma.analyzeDiagonals();
        System.out.println("\n" + ma.winer());
    }

    public void uploadNumbers() {
        keyboard=new Scanner(System.in);
        System.out.print("Cuantas fila y columnas tendra la matriz la matriz:");
        int rows = keyboard.nextInt();
        int columns = rows;
        mat=new int[rows][columns];
        diagoPrincipal = new int[mat.length];
        diagoSecundaria = new int[mat.length];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente: ");
                mat[f][c]=keyboard.nextInt();
            }
        }
        printMatriz(mat);
    }

    public void uploadNumbersRandom() {
        keyboard=new Scanner(System.in);
        System.out.print("Cuantas fila y columnas tendra la matriz la matriz:");
        int rows = keyboard.nextInt();
        int columns = rows;
        mat=new int[rows][columns];
        diagoPrincipal = new int[mat.length];
        diagoSecundaria = new int[mat.length];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {

                mat[f][c]= (int) (Math.random()* 100);
            }
        }
        printMatriz(mat);
    }

    public void analyzeDiagonals()
    {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    diagoPrincipal[i] = mat[i][j];
                    suma1 = suma1 + diagoPrincipal[i];
                }

                if(i+j == mat.length-1){
                    diagoSecundaria[i] = mat[i][j];
                    suma2 = suma2 + diagoSecundaria[i];
                }
            }
        }
        System.out.println("\nDiagonal Principal Suma: " + suma1);
        printArray(diagoPrincipal);

        System.out.println("\n\nDiagonal Secundaria Suma: " + suma2);
        printArray(diagoSecundaria);
    }

    public String winer() {
        if (suma1 > suma2) {
            return "Principal Diagonal win!";
        } else {
            if (suma1 < suma2) {
                return "Secondary Diagonal win!";
            }
        }
        return "Draw!";

    }

    static void printMatriz(int[][] pMatriz){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                System.out.print("\t" + pMatriz[i][j]);
            }
            System.out.println();
        }
    }

    static void printArray(int[] pArray){
        for(int i=0;i<pArray.length;i++){
            System.out.print("\t" + pArray[i]);
        }
    }
}
