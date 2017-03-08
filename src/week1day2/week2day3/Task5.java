package week1day2.week2day3;

/**
 * Created by Натали on 05.03.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = Tex.genMatrix(4, 4, 0, 5);
        Tex.printMatrix(matrix);
        System.out.println();

        out:
        for (int i = 0; 1 < matrix.length; i++) {
            in:
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    System.out.println("i:" + i + "j:" + j);
                    break out;
                }


            }
        }
    }
}