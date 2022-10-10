package _10102022;

//POJO Class
public class Hero {
    private int age;
    private String type;

    private Weapon weapon;

    public Hero(int age, String type) {
        this.age = age;
        this.type = type;
        this.weapon = new Weapon();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero(99, "Ogr");
//       System.out.println(hero1.getWeapon().getDamageLevel());
//        int[] i = {45,66,54};
//        System.out.println(Arrays.toString(i));
        hero1.setAge(111);
        System.out.println(hero1.getAge());

    }
}