package Homework;

import java.util.Scanner;

/**
 * Created by Натали on 03.03.2017.
 */
public class Task5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first;
        int second;
        int sum;
        first = scanner.nextInt();
        System.out.println("first = " + first);
        second = scanner.nextInt();
        System.out.println("second = " + second);
        sum = first + second;
        if(sum >= 11 && sum <= 19){
            System.out.println("It's good");
            System.out.println("sum=" + sum);
        }

    }
}
