package week1day2.week2day3;

/**
 * Created by Натали on 04.03.2017.
 */
class Tex {
    public static int[] generateArray(int size, int maxValue) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * maxValue);

        }
        return arr;
    }

    public static int[] generateArray(int size, int startPoint, int endPoint) {

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * (endPoint - startPoint) + startPoint);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                result += arr[i] + ", ";
            } else {
                result += arr[i];
            }
        }
        result += "]";
        System.out.println((result));
    }

    public static String decToBin(int value) {
        String result = " ";
        while (value > 1) {
            result += value % 2;
            value /= 2;
        }
        result += value;
        result = new StringBuilder(result)
                .reverse()
                .toString();
        return result;
    }

    public static int binToDec(String bin) {
        String reversedValue = new StringBuilder(bin)
                .reverse()
                .toString();
        char[] letters = reversedValue.toCharArray();
        int result = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (letters[1] == '1') {
                result += Math.pow(2, i);
            }

        }
        return result;

    }



    public static int [][] genMatrix(int lines , int rows , int min, int max) {

        int result[][] = new int[lines][rows];

        for (int i = 0; i<result.length; i++){
            for (int j = 0; j<result[i].length; j++){
                result[i][j] =(int) (Math.random ()*(max + 1 - min) + min);
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for (int j =0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

