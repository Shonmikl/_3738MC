package _07112022;

public class Loop {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {4, 5, 63, 21, 78, 96, 54};

        for (int a : arr) {
            System.out.println(a);
        }

        while (count < 4) {
            for (int i = 2; i < arr.length; i++) {
                arr[i] *= 10;
                count++;
            }
        }

        do {
            count++;
        } while (count < 4);
    }
}