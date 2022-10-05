package _05102022;

public class StaticExample {
    static int a;
    int b;

    public int getSum(int a, int b) {
        return  (a + b) * addM();
    }

    protected static int addM() {
        return 10;
    }
}
