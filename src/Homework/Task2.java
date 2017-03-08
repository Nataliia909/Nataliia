package Homework;

import java.util.Scanner;

/**
 * Created by Натали on 03.03.2017.
 */
public class Task2 {
 public static void main(String[] args) {
  Scanner scanner = new Scanner  (System.in);
  int x;
  int y;
  x = scanner.nextInt();
  y = scanner.nextInt();
System.out.println("x=" + x);
  System.out.println("y=" + y);

  if (x % y == 0) {
   System.out.println(true);
   System.out.println(x/y);
  }else {
   System.out.println(false);
  }
 }
}
