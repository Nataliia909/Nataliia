package week2day3;

import java.util.Arrays;

/**
 * Created by Натали on 04.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = {10, 0, -23, 30};
        array1[0] = 5;
        array1[2] = 4;
        //int left;
        //int right;
        int mult = Arrays.stream(array2)
                .reduce((left, right) -> left * right).getAsInt();
        for (int i = 0; i < array1.length; i++) {
            array1[1] = (int) (Math.random() * 10);
            System.out.println(array1[1] + " ");
        }


        // System.out.println(("Array1 has length: + array1.length");
        //System.out.println(("Array2 has length: + array2.length");

    }
}
