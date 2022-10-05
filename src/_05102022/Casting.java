package _05102022;

public class Casting {


    short s;
    static final double d = 65445.6;
    float f = 9999.5f;
    char c = 9999;
    int i1 = c;

    static int i = 999; // [ ]
    String si = "999";
    static String sss = "Это число равно -> ";

    static String str; // [ str ] -> [  ]
    static byte b = (byte) 241; //-128 +127 -->8 bit
    static int ex = 258; // 16 bit
    static int tttttt = 1777;
    public static void main(String[] args) {
        System.out.println((byte) tttttt);
        System.out.println(b);
 //       System.out.println((byte) ex);
        str = String.valueOf(i);
//        System.out.println(str);
//        System.out.println("Это число равно -> " + i);
//          System.out.println(sss + 999);
//        System.out.println(5 + "");
//        System.out.println(5 + 5);
//        System.out.println("Mama"+" Мыла");
//        Person person = new Person(25, "Vera");
    }
}