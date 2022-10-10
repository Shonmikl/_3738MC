package _10102022.loop;

public class IfExample {
    //if(условие выполняется) тогда {
    // делай этот код }
    //&&  = И, || = или

    private static void getMood(int age, boolean alcohol) {
        if(age <=25) {
            System.out.println("Вся жизнь впереди");
        }
        else if (age > 25 && alcohol == true) {
            System.out.println("Все еще лучше!!");
        }
        else System.out.println("Все печально");
    }

    public static void main(String[] args) {
        getMood(38, false);


    }
}
