package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class App {
    public static void main(final String[] args) {
        Locale.setDefault(Locale.US);
        final Scanner sc = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        final double areaX = x.area();

        System.out.println("Área do triângulo X:" + areaX);

        final double areaY = y.area();

        System.out.println("Área do triângulo Y:" + areaY);

        if (areaX > areaY) {
            System.out.println("Maior área é do triângulo X");
        } else {
            System.out.println("Maior área é do triângulo Y");
        }
        System.out.println("teste VS code");
        sc.close();

    }
}