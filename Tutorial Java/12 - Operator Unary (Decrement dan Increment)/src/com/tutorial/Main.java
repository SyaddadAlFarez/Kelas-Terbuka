package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // unary = operasi yang digunakan untuk satu variabel

        // unary + dan -
        int angka = 1;
        System.out.printf("\nunary '+' %d menjadi %d\n", angka, +angka);
        System.out.printf("unary '+' %d menjadi %d\n", angka, -angka);

        // unary increment postfix dan prefix
        int a = 5;
        System.out.printf("nilai %d dengan 'a++' (postfix) menjadi = %d\n", a, a++);
        int b = 5;
        System.out.printf("nilai %d dengan '++b' (prefix) menjadi = %d\n", b, ++b);

        // unary decrement postfix dan prefix
        int c = 5;
        System.out.printf("nilai %d dengan 'c--' (postfix) menjadi = %d\n", c, c--);
        int d = 5;
        System.out.printf("nilai %d dengan '--d' (prefix) menjadi = %d\n", d, --d);

        // unary boolean dengan ! untuk melakukan negasi
        boolean negasi = true;
        System.out.println("\n" + negasi);
        System.out.println("nilai boolean tanpa ! = " + negasi);
        System.out.println("nilai boolean dengan ! = " + !negasi);

    }
}
