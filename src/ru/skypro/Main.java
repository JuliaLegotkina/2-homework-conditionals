package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientOSNew = 0;
        int productionYear = 2014;

        if (clientOSNew == 0 && productionYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOSNew == 0 && productionYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOSNew == 1 && productionYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOSNew == 1 && productionYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        int year = 2021;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Год " + year + " является високосным.");
        } else {
            System.out.println("Год " + year + " является невисокосным.");
        }


        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка займет 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставка займет 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Доставка займет 3 дня");
        } else {
            System.out.println("Условия доставки уточняйте у менеджера");
        }


        int month = 13;
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Зима");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Весна");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Лето");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
