package _05102022;

public class CastingObject extends StaticExample {
    static int i;
    private static String s;

    private void get() {
    }

    public static void main(String[] args) {
        CastingObject castingObject = new CastingObject();
        castingObject.get();
        String s = String.valueOf(99);
        Person person = new Person(1, "");
        person.getTTT();
        StaticExample example = new StaticExample();
        StaticExample.addM();
    }
}
