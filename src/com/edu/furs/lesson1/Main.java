package com.edu.furs.lesson1;

import com.edu.furs.lesson1.overloading.MathOps;

public class Main {

    public static void main(String[] args) {
        byte b = 5;
        Main main = new Main();
        main.method(b);
    }

    void method(int i) {
        System.out.println("int");
    }

    void method(long i) {
        System.out.println("long");
    }

    void method(Integer i) {
        System.out.println("Integer");
    }

    void method(byte... i) {
        System.out.println("byte");
    }
}
