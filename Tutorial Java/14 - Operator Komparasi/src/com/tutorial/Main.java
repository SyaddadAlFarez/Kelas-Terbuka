package com.tutorial;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        boolean hasilKomparasi;
        // Operator Komparasi

        // sama dengan ==
        a = 10;
        b = 10;
        c = 12;
        d = 8;
        System.out.println("\n----- Sama Dengan -----");
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);
        hasilKomparasi = (a == c);
        System.out.printf("%d == %d --> %s \n", a, c, hasilKomparasi);
        hasilKomparasi = (a == d);
        System.out.printf("%d == %d --> %s \n", a, d, hasilKomparasi);

        // Tidak sama dengan !=
        System.out.println("\n----- Tidak Sama Dengan -----");
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);
        hasilKomparasi = (a != c);
        System.out.printf("%d != %d --> %s \n", a, c, hasilKomparasi);
        hasilKomparasi = (a != d);
        System.out.printf("%d != %d --> %s \n", a, d, hasilKomparasi);

        // Lebih dari >
        System.out.println("\n----- Lebih Dari -----");
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);
        hasilKomparasi = (a > c);
        System.out.printf("%d > %d --> %s \n", a, c, hasilKomparasi);
        hasilKomparasi = (a > d);
        System.out.printf("%d > %d --> %s \n", a, d, hasilKomparasi);

        // Lebih dari sama dengan >=
        System.out.println("\n----- Lebih Dari Sama Dengan-----");
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);
        hasilKomparasi = (a >= c);
        System.out.printf("%d >= %d --> %s \n", a, c, hasilKomparasi);
        hasilKomparasi = (a >= d);
        System.out.printf("%d >= %d --> %s \n", a, d, hasilKomparasi);

        // Kurang dari <
        System.out.println("\n----- Kurang Dari -----");
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);
        hasilKomparasi = (a < c);
        System.out.printf("%d < %d --> %s \n", a, c, hasilKomparasi);
        hasilKomparasi = (a < d);
        System.out.printf("%d < %d --> %s \n", a, d, hasilKomparasi);

        // Kurang dari sama dengan <=
        System.out.println("\n----- Kurang Dari Sama Dengan-----");
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);
        hasilKomparasi = (a <= c);
        System.out.printf("%d <= %d --> %s \n", a, c, hasilKomparasi);
        hasilKomparasi = (a <= d);
        System.out.printf("%d <= %d --> %s \n", a, d, hasilKomparasi);

    }
}
