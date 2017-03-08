package week1day2.week2day3;

import java.util.Scanner;

/**
 * Created by Натали on 05.03.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array size");
        int arrSize = scanner.nextInt();
        int[] values = new int[arrSize];


         for (int i = 0; i < values.length; i++){
             System.out.println("Please enter values #" + i);
             values [i] = scanner.nextInt();

         }
         Tex.printArray(values);
        System.out.println("Please enter value four search");
        int valueForSearch = scanner.nextInt();

        for(int i = 0; i < values.length; i++){
            if (values[1] == valueForSearch){
                System.out.println("Value" + valueForSearch + "on index" + i);
                break;
            }
            if (i == values.length - 1){
                System.out.println("Value not found");
            }
        }

          }
}