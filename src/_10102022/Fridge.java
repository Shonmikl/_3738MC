package _10102022;

public class Fridge {
    private String name = "INDEZIT";
    private final byte volume = 70;

    @Override
    public String toString() {
        return "Fridge{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}