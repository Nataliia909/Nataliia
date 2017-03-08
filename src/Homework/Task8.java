import java.util.Scanner;

/**
 * Created by Натали on 03.03.2017.
 */
public class Task8 {
    public static void main (String[] args) {
    Scanner scanner = new Scanner (System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    System.out.println(x % 10 == y % 10);
    }
}
