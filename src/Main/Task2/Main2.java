package Main.Task2;

public class Main2 {
    public static void main(String[] args){
        Person person = new Person("Васильев Иван", 23);
        person.talk();
        String fullName = person.getFullName();
        System.out.println(fullName);
        int age = person.getAge();
        System.out.println(age);
        person.setFullName("Олег");
        person.setAge(76);
        person.toString();
        String toString1 = person.toString();
        System.out.println(toString1);

    }
}
