package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Pengelompokan aritmatika
        int hasil;
        int x, m, c;

        Scanner userInput = new Scanner(System.in);
        hasil = 10 * 5 + 12;
        System.out.println(hasil);
        hasil = 10 + 5 * 12;
        System.out.println(hasil);
        // Menggunakan tanda kurung utuk mengelompokan
        hasil = (10 * 5) + (12 / 6);
        System.out.println(hasil);

        System.out.print("Niali x = ");
        x = userInput.nextInt();
        System.out.print("Niali m = ");
        m = userInput.nextInt();
        System.out.print("Niali bias = ");
        c = userInput.nextInt();

        hasil = (m * x * x) + c;
        System.out.println("Nilai y = " + hasil);
    }
}
