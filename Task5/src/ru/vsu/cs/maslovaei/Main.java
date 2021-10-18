package ru.vsu.cs.maslovaei;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double h = readNumber("Input h = ");

        printSlash(h);
    }

    private static void printSlash(double h) {

        for (int i = 1; i <= h; i++) {
            for (int m = 1; m <= i; m++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= h - i; j++) {
                System.out.print("\\");

            }
            System.out.println();
        }
    }


    private static double readNumber(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
