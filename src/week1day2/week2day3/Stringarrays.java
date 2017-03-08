package week1day2.week2day3;

/**
 * Created by Натали on 04.03.2017.
 */
public class Stringarrays {
    public static void main(String[] args) {
        String text = "Hello world This is some text";

        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'i') {
                counter++;
            }
        }
        System.out.println(counter);
    }

}