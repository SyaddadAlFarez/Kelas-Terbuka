package com.tutorial;

public class Main {
	public static void main(String[] args) {

		// Operasi Aritmatika

		int varA = 17;
		int varB = 7;
		int hasil;

		// Penjumlahan
		hasil = varA + varB;
		System.out.printf("%d + %d = %d \n", varA, varB, hasil);

		// Pengurangan
		hasil = varA - varB;
		System.out.printf("%d - %d = %d \n", varA, varB, hasil);

		// ekxponential
		hasil = varA * varB;
		System.out.printf("%d * %d = %d \n", varA, varB, hasil);

		// Pembagian (dalam integer tidak bisa pecahan)
		hasil = varA / varB;
		System.out.printf("%d / %d = %d \n", varA, varB, hasil);

		// Pembagian (dengan float dapat digunakan Pecahan)
		float a = 17;
		float b = 7;
		float hasilFloat;
		hasilFloat = a / b;
		System.out.printf("%d / %d = %d \n", a, b, hasilFloat);

		// Modulus
		hasil = varA % varB;
		System.out.printf("%d %% %d = %d \n", varA, varB, hasil);
	}
}
