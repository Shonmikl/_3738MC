package _10102022.loop;

import java.util.Arrays;

//99% для перебора коллекций, массивов.
// Не меняет коллекцию или массив
public class ForEach {
    public static void main(String[] args) {
        //              0  1   2   3   4
        int[] mikhail = {2, 4, 5, 6, 8};
        int[] nullArray = new int[10];

        String[] s = {"sl", "dkf", "jsld", "kfjsldkfj"};
        String[] sd = new String[10];

        System.out.println(Arrays.toString(nullArray));
        System.out.println(Arrays.toString(sd));


//        for (int i = 0; i < mikhail.length; i++) {
//            System.out.println(mikhail[i] * 4);
//        }

//        System.out.println("********************************");
//
//        for (int sergey : mikhail) {
//            System.out.println(sergey * 10);
//        }
    }
}