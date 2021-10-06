package Main.Task1;

import Main.Task2.Person;

public class Main {
    public static void main(String[] args) {
        Phone xiaomi = new Phone("Mi 6",456);

        System.out.println(xiaomi.model);
        System.out.println(xiaomi.number);
        System.out.println(xiaomi.weight);

         xiaomi.receiveCall("Вася");


         int rec = xiaomi.getNumber();
        System.out.println(rec);

        Phone xiaomi1 = new Phone("Poco");

        Phone xiaomi2 = new Phone();
        xiaomi2.model = "Mi 10";
        xiaomi2.number = 4588;
        xiaomi2.weight = 321;

        pone("Sams", "You", "qwer");

        tyu("lol", "jol", 123);


        Person person = new Person();

    }
    static void pone (String... pnm){
        for (int i = 0; i < pnm.length; i++) {
            System.out.println(pnm [i]);
        }

    }
    static void tyu (String fgh, String ghj, int y){
        System.out.println(fgh);
        System.out.println(ghj);
        System.out.println(y);
    }
}
