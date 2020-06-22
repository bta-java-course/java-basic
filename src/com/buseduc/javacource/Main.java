package com.buseduc.javacource;

public class Main {

    public static void main(String[] args) {
        String lock = "aaa";
        final float SUPER_CONSTANT;
        {
            SUPER_CONSTANT = 11.233f; // decimal-form literal
            float b = 3.222f; // It also acts as decimal literal
            float c = 0x123p3f; // Hexa-decimal form
            System.out.println(SUPER_CONSTANT);
            System.out.println(b);
            System.out.println(c);
        }
        System.out.println(SUPER_CONSTANT);

    }
}
