package Main.Task1;

public class Phone {
    String model;
    int number;
    int weight;

    public Phone(String model, int number, int weight){
        this.model = model;
        this.weight = weight;
        this.number = number;
    }

    public static void Main (String[] args){
        Phone Xiaomi = new Phone("Mi 6", 123, 456);

        Xiaomi.model = "Mi 6";
        Xiaomi.number = 123;
        Xiaomi.weight = 456;
        System.out.println(Xiaomi.model);
        System.out.println(Xiaomi.number);
        System.out.println(Xiaomi.weight);
    }
}