package week1day2.week2day3;

/**
 * Created by Натали on 04.03.2017.
 */
public class ArraysBreak {
    public static void main(String[] args) {

        int[] mas1 = new int[10];
        mas1 = Tex.generateArray(10, 0, 7);
        Tex.printArray(mas1);
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] == 2) {
                System.out.println("2 is one index");
                break;
            }
        }
        for (int i = 0; i < mas1.length; i++) {
            if (i % 2 != 0) {
                continue;
            }
        }
        System.out.println((mas1[1] + " "));


        int value = 25;
        String bin = Tex.decToBin(value);
        System.out.println(bin);
        System.out.println(Tex.binToDec(bin));

    }
}
