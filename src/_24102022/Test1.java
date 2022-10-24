package _24102022;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person("Vera", 30);
        Person p2 = new Person("Robert", 30);
        Person p3 = new Person("Jelena", 30);


        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals("Robert")) {
                list.get(i).setName("Go 0.7l");
            } else System.out.println("Study JAVA");
        }
        System.out.println(list);

    }
}
