package Main.Task2;

public class Person {
    private String fullName;
    private int age;

    public Person (){
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public Person(String fullName){
        this.fullName = fullName;
    }


    public void talk (){
        System.out.println(fullName + " Говорит");


    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
