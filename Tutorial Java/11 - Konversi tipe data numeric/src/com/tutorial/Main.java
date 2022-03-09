package com.tutorial;

public class Main {
	public static void main(String[] args) {
		// Program Konversi data bilangan bulat

		// Byte - Short - Integer - long
		// tidak ada masalah jika mengubah dari nilai Byte kecil ke besar

		System.out.println("=====Kecil ke Besar=====");
		byte nilaiByte = 10;
		System.out.println("nilai Byte = " + nilaiByte);

		short nilaiShort = nilaiByte;
		System.out.println("nilai short = " + nilaiShort);

		int nilaiInt = nilaiShort;
		System.out.println("nilai integer = " + nilaiInt);

		long nilaiLong = nilaiInt;
		System.out.println("nilai long = " + nilaiLong);

		System.out.println("=====Besar ke Kecil=====");
		// Akan error jika mengubah dari nilai Byte besar ke kecil.
		// bisa dengan mengkonversi terlebih dahulu ke byte tapi akan mengubah nilai

		long nilaiLong2 = 1234567890;
		int nilaiInt2 = 123456789;
		short nilaiShort2 = 12345;

		byte nilaiByte2;

		nilaiByte2 = (byte) nilaiLong2;
		System.out.println("nilai long diubah ke byte = " + nilaiByte2);

		nilaiByte2 = (byte) nilaiInt2;
		System.out.println("nilai int diubah ke byte = " + nilaiByte2);

		nilaiByte2 = (byte) nilaiShort2;
		System.out.println("nilai short diubah ke byte = " + nilaiByte2);

		// casting data dari bilangan bulat ke pecahan
		int a = 10;
		int b = 4;
		float hasil;

		hasil = (float) a / (float) b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(hasil);
		System.out.printf("%d / %d = %f", a, b, hasil);

	}
}
