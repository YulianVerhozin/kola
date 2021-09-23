package Main.Task1;

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
    }
}
