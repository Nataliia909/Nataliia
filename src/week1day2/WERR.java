package week1day2;

import java.util.Scanner;

/**
 * Created by Натали on 26.02.2017.
 */
public class WERR {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some text");
        String text = scanner.nextLine();
        System.out.println("Please enter some word");
        String word = scanner.nextLine();
        checkwords(text,word);
        //System.out.println(number + " is even: " + result);

    }
    public static void checkwords(String text , String word) {
        if (text.contains(word) && word.length() > 5)
        {
            System.out.println("good word");
        }
        else
            {
            System.out.println("Bad");
            }
    }


    public static void checkValue(int x){
        if (x< 100 && x >= 10 && x % 2 == 0){
            System.out.println(x + " is <=100 and >=10 and is over");
        }else {
            System.out.println("Error");
        }
    }


    public static boolean checkEven(int value ){
        if (value%2 == 0){
           return true;
        }else {
            return false;

            }
        }
    public static boolean checkLength(String text){
        if(text.length()>= 10) {
        System.out.println(" Text has length 10+ characteres");
        return true;
        } else {
            System.out.println("Text has length less than 10");
            return false;
        }
    }

}

