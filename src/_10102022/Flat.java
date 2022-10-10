package _10102022;

public class Flat {
    private byte flatQuantity;
    private byte bathRoom;
    private int square;
    private boolean balcony;
    private Fridge fridge;

    public Flat(byte flatQuantity, byte bathRoom, int square, boolean balcony) {
        this.flatQuantity = flatQuantity;
        this.bathRoom = bathRoom;
        this.square = square;
        this.balcony = balcony;
        this.fridge = new Fridge();
    }

    public byte getFlatQuantity() {
        return flatQuantity;
    }

    public byte getBathRoom() {
        return bathRoom;
    }

    public int getSquare() {
        return square;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public Fridge getFridge() {
        return fridge;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "flatQuantity=" + flatQuantity +
                ", bathRoom=" + bathRoom +
                ", square=" + square +
                ", balcony=" + balcony +
                ", fridge=" + fridge +
                '}';
    }
}

class Main1 {
    public static void main(String[] args) {
        Flat oneRoomFlat = new Flat((byte) 1, (byte) 1, 55, true);
        System.out.println(oneRoomFlat);
    }
}