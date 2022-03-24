package ru.skypro;

import java.time.LocalDate;

public class Main {
    public static void reversNumber(int number []) {
        for (int i = number.length; i > 0; i--) {
            System.out.print(number [i-1]);
        }
        System.out.println();
    }
    public static void checkStringOnDouble (String random) {
             char arr[] = random.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1] ){
                System.out.println("Дублирован символ: " + arr[i]);
                break;
            }else {
                System.out.println("Нет дублей");
            }
        }
    }
    public static void countTimeOfDelivery(int deliveryDistance){
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1 );
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60){
            System.out.println ("Потребуется дней: " + 2);}
        else if (deliveryDistance >= 61 && deliveryDistance <=100) {
            System.out.println("Потребуется дней: " + 3);
        }
    }
    public static void selectApplication (int clientOs, int сlientDeviceYear, int currentYear){
        if (clientOs == 1 && сlientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && сlientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 0 && сlientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
    public static void countLeapYear(int a){
        int eachFourYear = a % 4;
        int eachHundredYear = a % 100;
        int eachFourHundredYear = a % 400;
        if (eachFourHundredYear == 0 && eachHundredYear == 0){
            System.out.println("Год весокосный");
        }
        else if (eachHundredYear == 0){
            System.out.println("Год не весокосный");
        }
        else if (eachFourYear == 0 || eachFourHundredYear == 0){
            System.out.println("Год весокосный");
        }
        else
            System.out.println("Год не весокосный");
    }
    public static void main(String[] args) {
        {
            // Задача 1
            int currentYear = 2021;
            countLeapYear(currentYear);
        }
        {
            // Задача 2
            int clientOs = 0;
            int сlientDeviceYear = 2021;
            int currentYear = LocalDate.now().getYear();
            selectApplication(clientOs, сlientDeviceYear, currentYear );
        }
        {
            // Задача 3
            int  deliveryDistance = 95;
            countTimeOfDelivery(deliveryDistance);
        }
        {
            //Задача 4
            String random = "aabccddefgghiijjkk";
            checkStringOnDouble(random);
        }
        {
            //Задача 5
            int [] number = {3, 2, 1, 6, 5};
            reversNumber(number);
        }

    }
}
