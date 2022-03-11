package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk mnangkap input user
        Scanner userInput = new Scanner(System.in);

        // Sebuah program untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        // Operasi logika
        System.out.print("Masukan Nilai Tebakan = ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("jawaban anda = " + statusTebakan);

        // Operasi aljabar bolean and / or
        System.out.print("Masukan angka antara 4 dan 9 = ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("Jawaban anda = " + statusTebakan);
    }
}
