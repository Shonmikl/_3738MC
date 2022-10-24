package _24102022;

import java.util.Random;
import java.util.Scanner;

public class Test33 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void get(int num1, int num2, String operation) {

        int result;
        operation = SCANNER.next();
        switch (operation) {
            case "+" -> System.out.println((num1 + num2));
            case "-" -> result = num1 - num2;
            default -> {
                System.out.println("Incorrect command");
                result = 0;
            }
        }
    }

    public static void main(String[] args) {
        get(12, 12, "+");
//        int[] arr = {987, 65, 42, 3, 1, 65, 49, 8, 76, 54, 321};
//        boolean[] booleans = {true, false, false, false, true};
//
//        for (int i = 0; i < booleans.length; i++) {
//            if(booleans[i]) {
//                booleans[i] = false;
//            }
//            booleans[i] = true;
//        }
    }

}