package com.d1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите градусы С для перевода");
                int c = s.nextInt();

                double f = c * 1.8 + 32;

                System.out.printf("%d градусов цельсия = %.1f градусов по фаренгейту \n", c, f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
