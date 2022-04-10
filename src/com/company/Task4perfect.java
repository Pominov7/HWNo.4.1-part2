package com.company;

public class Task4perfect {
    public static void main(String[] args) {
        //С помощью цикла for начинаем счёт от 0 до 1000000
        for (int num = 0; num <= 1000000; num++) {
            int sum = 0; //Переменная для суммирования делителей
            //Ищем все делители
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            //  Проверка на равенство текущего числа и суммы делителей
            //  Если подходит, добавляем в список результатов
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}

