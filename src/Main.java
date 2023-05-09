import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        task1(2018);
        task2(1, currentYear);
        task3(10);
    }
            public static void task1(int year) {
                System.out.println("Задача 1");
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " год является високосным.");
                } else {
                    System.out.println(year + " год не является високосным.");

                }                 }
            public static void task2(int clientOS, int clientDeviceYear) {
                System.out.println("Задача 2");

                if (clientDeviceYear <= 2015 && clientOS == 0) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else if (clientOS == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else if (clientOS == 1 && clientDeviceYear <= 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }

            }
            public static void task3(int deliveryDistance) {
                System.out.println("Задача 3");
                int deliveryDay = 1;
                if (deliveryDistance > 20) {
                    deliveryDay++;
                }
                if (deliveryDistance > 60) {
                    deliveryDay++;
                }
                if (deliveryDistance > 100) {
                    System.out.println("Доставка невозможна.");
                }
                else System.out.println("Потребуется дней: " + deliveryDay);
                       }
    }
