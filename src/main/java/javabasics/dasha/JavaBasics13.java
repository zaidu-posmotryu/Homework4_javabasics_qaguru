package javabasics.dasha;

import java.util.Scanner;

public class JavaBasics13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        if (x > 0 && y>0)
        {
            System.out.println(1);
        }
        else if (x<0 && y>0)
        {
            System.out.println(2);
        }
        else if (x<0 && y<0)
        {
            System.out.println(3);
        }
        else if (x>0 && y<0)
        {
            System.out.println(4);
        }
    }

    /*
Координатные четверти
Ввести с клавиатуры два целых числа (координаты "x" и "y"). Известно, что точка не лежит на координатных осях OX и OY. Вывести на экран номер координатной четверти,
в которой находится данная точка. Для 1й четверти x>0 и y>0; для 2й четверти x<0 и y>0; для 3й четверти x<0 и y<0; для 4й четверти x>0 и y<0.
 */



}
