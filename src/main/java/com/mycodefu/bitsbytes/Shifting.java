package com.mycodefu.bitsbytes;

import org.apache.commons.lang3.StringUtils;

public class Shifting {
    public static void main(String[] args) {
        int shifty = 255;
        String shiftyBits = StringUtils.leftPad(Integer.toBinaryString(shifty), 32, "0");
        System.out.printf("int value %d (%s)\n", shifty, shiftyBits);

        for (int i = 0; i < 32; i++) {
            int shifted = shifty << i;
            String shiftedBits = StringUtils.leftPad(Integer.toBinaryString(shifted), 32, "0");
            System.out.printf("shifted %d bit%s left: %d (%s)\n", i, i == 1 ? "" : "s", shifted, shiftedBits);
        }

        for (int i = 0; i < 32; i++) {
            int shifted = shifty >> i;
            String shiftedBits = StringUtils.leftPad(Integer.toBinaryString(shifted), 32, "0");
            System.out.printf("shifted %d bit%s right: %d (%s)\n", i, i == 1 ? "" : "s", shifted, shiftedBits);
        }

    }
}
