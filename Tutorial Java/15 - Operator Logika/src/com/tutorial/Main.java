package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Operator logika
        boolean a, b, c;

        // OR (||) akan bernilai true jika ada yang true
        System.out.println("----- OR -----");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        // AND (&&) akan bernilai salah jika ada yang salah
        System.out.println("----- AND -----");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        // XOR (^) akan bernilai benar jika berbeda
        System.out.println("----- XOR -----");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        // Negasi (!) membalik nilai
        System.out.println("----- Negasi -----");
        a = true;
        c = !a;
        System.out.println(a + " (!) -->" + c);
        a = false;
        c = !a;
        System.out.println(a + " (!) -->" + c);

    }

}
