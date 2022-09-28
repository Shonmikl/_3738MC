package _28092022;

import java.util.Scanner;

public class Test2 {
    /**
     *  1]  int m1(f1)
     *  2]  void m2(f1, f2) sout
     *  3]  int m3(f1, f2, f3)
     *  4]  m4(f1, m) sout
     *  5]  int m5(m, m)
     *  6]  f1, f2 = init || scanner
     *  scanner.nextInt(); читаем Int с консоли
     * */

    static void get(int a, int b){
        int result = a+b;
        System.out.println("The result is: " + result);
    }

    public static void main(String[] args) {
        //1. Объявить сканнер
        //2. Выбрать любые два пункта
        //3. Написать код
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first digit:....");
        int a = scanner.nextInt();
        System.out.println("Please input second digit:....");
        int b = scanner.nextInt();
        System.out.println("Your digits are: " + a + " and " + b);
        get(a, b);
    }
}