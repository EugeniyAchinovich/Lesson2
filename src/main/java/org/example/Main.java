package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("ЗАДАНИЕ 1");
        int a, b, c;

        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();

        a = 4 * (b + c - 1) / 2;

        System.out.print("a = ");
        System.out.println(a);

        // Задача 2
        System.out.println("ЗАДАНИЕ 2");
        int n, result;

        System.out.print("n = ");
        n = scanner.nextInt();

        result = n / 10 + n % 10;

        System.out.print("result = ");
        System.out.println(result);

        // Задача 3
        System.out.println("ЗАДАНИЕ 3");
        System.out.print("n = ");
        n = scanner.nextInt();

        result = n / 100 + (n % 100) / 10 + (n % 100) % 10;

        System.out.print("result = ");
        System.out.println(result);

        // Задача 4
        System.out.println("ЗАДАНИЕ 4");
        float x;

        System.out.print("x = ");
        x = scanner.nextFloat();

        if (x - (int)x >= 0.5)
            x++;

        System.out.print("Округлённое число = ");
        System.out.println((int)x);

        // Задача 5
        System.out.println("ЗАДАНИЕ 5");
        int q, w;

        q = scanner.nextInt();
        w = scanner.nextInt();

        System.out.println(q + " / " + w + " = " + q / w + ", остаток = "+ q % w);

        // Задача *
        System.out.println("ЗАДАНИЕ *");
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + ", b = " + b);
    }
}