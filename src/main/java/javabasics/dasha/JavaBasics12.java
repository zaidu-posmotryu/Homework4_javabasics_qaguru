package javabasics.dasha;

import java.util.Scanner;

public class JavaBasics12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age = console.nextInt();
        if (age < 20 || age > 60)
        {
            System.out.println("можно не работать");
        }
    }
}
/*
Работать или не работать - вот в чем вопрос
*/
/* Напиcать программу, которая будет считывать с клавиатуры возраст. Если возраст от 20 до 60 (включительно), то выводить ничего не нужно, иначе -
вывести фразу "можно не работать". С помощью  оператора if без else и логического оператора "||" */
