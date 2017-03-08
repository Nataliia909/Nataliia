package week1day2;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * Created by Натали on 26.02.2017.
 */
public class intro {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Plese enter first value");
        int value1 = scanner.nextInt();
        System.out.println("Please enter second value");
        int value2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter operation type");
        String operationType = scanner.nextLine();
        float rea = doOperation(value1, value2, operationType);
        System.out.println("Result; " + rea);
    }

    public static float doOperation(float x, float y, String operationType) {

        if (operationType.equals("+")) {
            return x + y;
        }
        if (operationType.equals("-")) {
            return x - y;
        }
        if (operationType.equals("*")) {
            return x * y;
        }
        if (operationType.equals("/")) {
            return x / y;
        }
        System.out.println("wrong operationType");
        return 0;

    }

}
