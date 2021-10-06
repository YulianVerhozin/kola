package Main.Task2;

public class Person {
    String fullName;
    int age;

    Person (){
    }
    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    Person(String fullName){
        this.fullName = fullName;
    }


    public void talk (){
        System.out.println(fullName + " Говорит");


    }
}
