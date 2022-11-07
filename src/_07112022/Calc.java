package _07112022;

public class Calc {
    int plus(int a, int b) {
        getSOUT();
        return a + b;
    }

    double divide(double a, double b) {
        getSOUT();
        return a / b;
    }

    private static void getSOUT() {
        System.out.println("Result is:...");
    }

    String getSmth(int a) {
        String res1 = "!";
        String res2 = "?";
        if(a %2 == 0) {
            return res1;
        }
        return res2;
    }
}