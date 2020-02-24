package com.mycodefu.bitsbytes;

public class Shifting {
    public static void main(String[] args) {
        int shifty = 255;
        for (int i = 0; i < 32; i++) {
            System.out.printf("int value %d shifted %d bit%s left: %d\n", shifty, i, i == 1 ? "s" : "", shifty << i);
        }

        for (int i = 0; i < 32; i++) {
            System.out.printf("int value %d shifted %d bit%s right: %d\n", shifty, i, i == 1 ? "s" : "", shifty >> i);
        }

    }
}
