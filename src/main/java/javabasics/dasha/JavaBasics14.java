package javabasics.dasha;

public class JavaBasics14 {
    public static void main(String args[]) {
        int i = 2147483647;
        System.out.println("i = " + i);
        int j = ++i;
        System.out.println("Now i is = " + i);
        System.out.println("j =" + j);

        /* В j произошло переполнение максимального предела целого числа */

        int x = 2147483647;
        int y = x + 2;
        System.out.println(y);

       int q = 1000000000;
        int r = 2000000000;
        int s = q * r;
        System.out.println(s);
    }
}
