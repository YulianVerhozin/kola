package Task;

public class Task1 {
    public static void main(String[] args) {

        // Написать цикл while который десять раз печатет слово HEllo

        int i = 0;
        while(i < 10) {
            System.out.println("Hello");
            i = i + 1;
        }

        // Написать цикл for который десять раз печатет слово HEllo

        for(int q = 0; q <= 10; q++){
            System.out.println("Hello");            // q++ = q
        }


        // Написать цикл while(true) который напчетает 10 раз слово hello и завершится

        int y = 10;
        while(true) {
            System.out.println("Hello");
            y = y - 1;
            if (y == 0) {
                break;
            }
        }


        //представь что ты разработчик игры warzone, тебе код за перезарядку оружия
        //У тебя есть магазин в котором 30 патронов, после выстрела патронов становиться на 1 меньше
        // когда в магазине остаеться 0 патронов оружие перезаряжаеться


    }

}
