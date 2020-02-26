package com.mycodefu.bitsbytes;

import java.nio.ByteBuffer;

public class Shrinker {
public static void main(String[] args) {
	double x = 1023.571428571428571428;
	ByteBuffer buffer = ByteBuffer.allocate(2).putShort((short)(x*10)).flip();
	double xShortened = ((double)buffer.getShort())/10;
	double scaleAmount = 3.75;
	System.out.printf("shortened double: %s, scaled: %s\n original: %s, scaled: %s", xShortened+"", xShortened*scaleAmount+"", x+"", x*scaleAmount);
}
}
