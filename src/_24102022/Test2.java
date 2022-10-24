package _24102022;

import java.util.Random;

public class Test2 {
    /**
     * int x = 5 (у нас есть один элемент со значением 5)
     * int[] y = {1,2,3,4,5,6,7,8,99}; (массив == много цифорок)
     * y[4]
     * int[] a = new int[12]
     *
     * Student[] mc = new Student[13];
     * String[] names = new String[13]
     * fori(s=0; s < mc.length; s++) {
     *     if(names[s] == Robert) {
     *         mc[s] = "Go to 1.7l"
     *     }
     *     mc[s] = names[s];
     * }
     */

    /**
     * Loop:
     * if(условие == true) {тогда делай то что тут}
     * while() {    }
     * fori(){}
     *
     */

    public static void main(String[] args) {
        int[] awwwww = new int[11];
        get(awwwww);

    }

    public static int[][] get(int h, int w) {
        int[][] a = new int[h][w];






        return a;
    }
    public static void get(int[] aa) {
        int[] order = new int[aa.length];
        int[] reverse = new int[aa.length];

        for (int i = 0; i < order.length; i++) {
            order[i] = new Random().nextInt();
        }

        for (int i = reverse.length - 1; i > -1; i--) {
            reverse[i] = order[order.length - 1];
        }
    }
}
