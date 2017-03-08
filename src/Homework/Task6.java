package Homework;

import java.util.Scanner;

/**
 * Created by Натали on 03.03.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        float resl;
        resl = scanner.nextFloat();
        System.out.println("resl=" + resl);
        if (resl >= 0 && resl <=1) {
            System.out.println("Its good");
        }else{
            System.out.println("Its not good");
        }
    }
}
