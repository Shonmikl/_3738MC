package _10102022;
//POJO Class
public class Hero {
    private int age;
    private String type;

    public Hero(int age, String type) {
        this.age = age;
        this.type = type;
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
        Hero p1 = new Hero(100, "Wizard");
        System.out.println(p1.getAge());
    }
}
