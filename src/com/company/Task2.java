package com.company;

public class Task2 {
    public static void main(String[] args) {
        //С помощью цикла for начинаем счёт от 2 до 1000000
        for (int n = 2; n <= 1000000; n++) {
            boolean isNumber = true;//объявляем флаг булевого типа
            for (int i = 1; i <= Math.sqrt(n); i++) { //вложенный цикл for
                //условие if, при котором введенное число должно делится на i без остатка
                if (n % i == 0 && i > 1) {
                    isNumber = false;
                    break;// если число делится с остатком на i и больше 1 то прерываем вложенный цикл
                }
            } if (isNumber) {//если true, выводим в консоль n
                System.out.print(n + " ");
            }
        }
    }
}
