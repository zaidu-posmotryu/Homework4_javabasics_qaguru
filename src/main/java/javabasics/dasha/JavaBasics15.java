package javabasics.dasha;

import java.util.Scanner;

public class JavaBasics15 {

       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numberA = scanner.nextInt();
            int numberB = scanner.nextInt();
            int result = numberA > numberB ? numberA : numberB > numberA ? numberB : numberA;
                    {
                System.out.println(result);
                    }
            }
}

/* программа с использованием тернарного оператора, которая считывает с клавиатуры два числа и выводит на экран большее из них. Если числа одинаковые, то выводится любое. */