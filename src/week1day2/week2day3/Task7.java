package week1day2.week2day3;

import java.util.Scanner;

/**
 * Created by Натали on 05.03.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("1. Say \"Hello\"");
        System.out.println("2. Say \"Goobye\"");
        System.out.println("3. Say \"Hallo\"");
        System.out.println("4. Say \"Bonjere\"");
        System.out.println("5. Say \"Hey\"");
        System.out.println("6. Say \"Olla\"");

        String choose = scanner.nextLine();
        while (true) {
            System.out.println("1. Say \"Hello\"");
            System.out.println("2. Say \"Goobye\"");
            System.out.println("3. Say \"Hallo\"");
            System.out.println("4. Say \"Bonjere\"");
            System.out.println("5. Say \"Hey\"");
            System.out.println("6. Say \"Olla\"");

            switch (choose) {
                case "1":
                    sayHello(getName(scanner));
                    break;
                case "2":
                    sayGoodBye(getName(scanner));
                    break;
                case "3":
                    sayHallo(getName(scanner));
                    break;
                case "4":
                    sayBonjere(getName(scanner));
                    break;
                case "5":
                    sayHey(getName(scanner));
                    break;
                case "6":
                    System.out.println("Bye");
                    return;
                default:
                    System.out.println("Wrong choose");
                    break;
            }

        }
    }
    public static String getName (Scanner scanner) {
        System.out.println("Please enter name");
        return scanner.nextLine();
    }

        public static void sayHello (String name) {
            System.out.println("Hello" + name);
        }

    public static void sayGoodBye (String name){
        System.out.println("Good bye" + name);
    }
    public static void sayHallo (String name){
        System.out.println("Hallo" + name);
    }

    public static void sayBonjere (String name) {
        System.out.println("Bonjere" + name);
    }


    public static void sayHey (String name) {
        System.out.println("Hey" + name);
    }

    public static void sayOlla (String name){
        System.out.println("Olla" + name);
    }

}
