package _28092022;

import _05102022.StaticExample;

import java.util.Scanner;

public class Test extends StaticExample{

    /**
     * public - видимость везде
     * protected - наследников
     * [  ] - package private
     * private - на уровне класса
     * */

    static double priceWithoutDiscount = 10;

    void get() {
        priceWithoutDiscount = 10;
    }

    public static void main(String[] args) {
        Test test = new Test();
        priceWithoutDiscount = priceWithoutDiscount++;
        StaticExample.addM();
    }
}