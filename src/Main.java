//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
           System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        else {
            System.out.println(" он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 5;
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }
        else {
            System.out.println("Можно ездить спокойно");
        }

        int ageOfAPerson = 2;
        if (ageOfAPerson >= 2 && ageOfAPerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfAPerson + ", то ему нужно ходить в детский сад");
        }
        else if (ageOfAPerson >= 7 && ageOfAPerson <= 17) {
            System.out.println("Если возраст человека равен " + ageOfAPerson + ", то ему нужно ходить в школу");
        }
        else if (ageOfAPerson >= 18 && ageOfAPerson <= 24) {
            System.out.println("Если возраст человека равен " + ageOfAPerson + ", то ему нужно ходить в университет");
        }
        else {
            System.out.println("Пора ходить на работу");
        }

        int ageOfAChildren = 10;
        if (ageOfAChildren <= 5) {
            System.out.println("Если возраст ребенка равен " + ageOfAChildren + ", то он не может кататься на аттракционе.");
        }
        else if (ageOfAPerson > 5 && ageOfAChildren <= 14) {
            System.out.println("Если возраст ребенка равен " + ageOfAChildren + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + ageOfAChildren + ", то он может кататься без сопровождения взрослого.");
        }

        int seats = 60;
        int people = 102;
        boolean seatInACarriage = people <= 102;
        boolean freeSeat = seats < 60;
        if (seatInACarriage) {
            if (freeSeat) {
                System.out.println("Есть сидячие места");
            }
            else {
                System.out.println("Есть только стоячие места");
            }
        }
        else {
            System.out.println("вагон полон");
        }

        int one = 5;
        int two = 8;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one + " самое большое число");
        }
        else if (two > one && two> three) {
            System.out.println(two + " самое большое число");
        }
        else {
            System.out.println(three + " самое большое число");
        }
    }
}