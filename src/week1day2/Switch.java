package week1day2;

/**
 * Created by Натали on 26.02.2017.
 */
public class Switch {
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
        System.out.println(value1 + operationType+value2+ "=" + rea);
    }

    public static float doOperation(float x, float y, String operationType ) {
        float result;
        switch (operationType) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                System.out.println("Wrong operation type. Please try again...");
                 result = 0;
        }
        return result;
    }
    {}
        }
