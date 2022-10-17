package _12102022;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx {
    public static void main(String[] args) {
//        int[] array = new int[5];//[0 0 0 0 0]
//        int[] array1 = {98, 7, 65, 41, 23, 45, 6};
//        char[] charArray = new char[5];
//        int a = 4;
//        String[] stringArray = new String[6];
//        System.out.println(Arrays.toString(stringArray));

//        char[] chars = {'d', 'u'};
//        Parent[] parent = new Parent[22];
                                  //[0 1 2 3 4 5]idx length = 6;
        int[] array = new int[6]; //[_ _ _ _ _ _]

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(15);
        }

        /**
         * Random random = new Random();
         * random.nextInt();
         * new Random().nextInt(15);
         * */

        System.out.println(Arrays.toString(array));
    }
}