package week1day2.week2day3;

import java.text.MessageFormat;

/**
 * Created by Натали on 05.03.2017.
 */
public class StringFormat {
    public static void main(String[] args) {
        String name = "Nataliia";
        int age = 21;
        float height = 1.70f;
        boolean isWoman = true;

        System.out.println("Name is: " + name + "\nage is:" + age + "\nHeight is: " + height );

        String result =  String.format("Name is: %s\n" +
                "Age is: %d\n" +
        "Height is: %.2f\n"+
        "Woman: %b" , name , age , height, isWoman);
        System.out.println( result);

        String result2 = MessageFormat.format("Name is {0}: %s\n" +
                "Age is {1}: %d\n" +
                "Height is {2}: %.2f\n"+
                "Woman: %b {3}" , name , age,height, isWoman);
        System.out.println(result2);



    }
}
