public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println();
        System.out.println("Задача №1");
        int contribution = 15000;
        int deposit = 0;
        int count = 0;
        while (deposit < 2459000) {
            deposit = deposit + contribution;
            count = count + 1;
            System.out.println("Месяц " + count + " , сумма накоплений равна " + deposit + " рублей");
        }
    }
    public static void task2 () {
        System.out.println();
        System.out.println("Задача №2");
        int count = 0;
        while (count < 10) {
            count = count + 1;
            System.out.print(count + " ");
        }
        System.out.println();
        for (;count > 0;count-- ) {
            System.out.print(count + " ");
        }
    }
    public static void task3 () {
        System.out.println();
        System.out.println("Задача №3");
        int population = 12000000;
        int mortalityPer1000 = 8;
        int birthRatePer1000 = 17;
        int year = 0;

        while (year < 10) {
            year++;
            population = population - population/1000*mortalityPer1000 + population/1000*birthRatePer1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
    public static void task4 () {
        System.out.println();
        System.out.println("Задача №4");
    int total = 15000;
    int contribution = 15000;
    int count=0;
    while (total < 12000000) {
        total = total + total / 100*7/12 + contribution;
        count++;
        System.out.println("Месяц " + count + " на счету:" + total + " рублей");
    }

    }
    public static void task5 () {
        System.out.println();
        System.out.println("Задача №5");
        int total = 15000;
        int contribution = 15000;
        int count=0;
        while (total < 12000000) {
            total = total + total / 100*7/12 + contribution;
            count++;
            if (count % 6 == 0){
            System.out.println("Месяц " + count + " на счету:" + total + " рублей");}
        }
        System.out.println("Последний месяц " + count + " на счету:" + total + " рублей");
    }
    public static void task6 () {
        System.out.println();
        System.out.println("Задача №6");
        int total = 15000;
        int contribution = 15000;
        int count=0;
        while (count < 12*9) {
            total = total + total / 100*7/12 + contribution;
            count++;
            if (count % 6 == 0){
                System.out.println("Месяц " + count + " на счету:" + total + " рублей");}
        }
        System.out.println("Итого за 9 лет на счету:" + total + " рублей");
    }

    public static void task7 (){
        System.out.println();
        System.out.println("Задача №7");
        int fridayDate = 3;
        int day = 1;
        while (day<=31) {
            if (day % 7 == fridayDate) {
                System.out.println("Сегодня пятница, "+ day + "-е число");
            }
            day++;
        }
    }
    public static void task8 (){
        System.out.println();
        System.out.println("Задача №8");
        int yearCurrent = 2023;
        int comet = 79;
        int year = 0;
        while (year <= yearCurrent + 100) {
            if (year >= yearCurrent - 200 ) {
                System.out.println(year);
            }
            year = year + comet;
        }

    }
}