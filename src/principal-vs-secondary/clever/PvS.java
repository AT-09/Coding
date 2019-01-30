public class PvS {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int index = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++)
            {
                matrix[x][y] = Integer.valueOf(args[index++]);
            }
        }
        System.out.println(diagonal(matrix));
    }

    public static String diagonal(int[][] matrix){
        int p=0;
        int d=0;
        for(int i=0;i<matrix.length;i++){
            p+=matrix[i][i];
            d+=matrix[i][matrix.length-1-i];
        }
        return (p>d) ? "Principal Diagonal win!" : (d>p) ? "Secondary Diagonal win!" : "Draw!";
    }
}