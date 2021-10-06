package Main.Task1;

public class Phone {
    String model;
    int number;
    int weight;

    public Phone(String model, int number){
        this.model = model;
        this.number = number;
    }
    public Phone(String model){
        this.model = model;
    }
    public Phone(){

    }

    public Phone(String model, int number, int weight){
        this.model = model;
        this.weight = weight;
        this.number = number;
    }
    public void receiveCall (String name){
        System.out.println("Звонит " + name);
    }
    public int getNumber(){
        return number;
    }


}