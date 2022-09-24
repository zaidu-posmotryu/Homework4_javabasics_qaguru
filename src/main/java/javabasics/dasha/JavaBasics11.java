package javabasics.dasha;

import java.util.Scanner;

public class JavaBasics11 {
    public static void main(String[] args) {
        final String TRIANGLE_EXISTS = "треугольник существует";
        final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

            Scanner console = new Scanner(System.in);
            int a = console.nextInt();
            int b = console.nextInt();
            int c = console.nextInt();
            if ((a < b + c) && (b < c + a) && (c < a + b))
            {
                System.out.println(TRIANGLE_EXISTS);
            }
            else {
                System.out.println(TRIANGLE_NOT_EXISTS);
            }
        }
    }

// Треугольник
/* написать программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
Для этого нужно: Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника; Определить возможность существования треугольника по сторонам.
Чтобы это выяснить, нужно сравнить каждую сторону с суммой двух других: Если в каждом сравнении сторона меньше суммы двух других, то треугольник с такими сторонами существует.
Если хотя бы в одном случае сравнения одна сторона окажется больше или равна сумме двух других, то треугольника с такими сторонами не существует.
 */
