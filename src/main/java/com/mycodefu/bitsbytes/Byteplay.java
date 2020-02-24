package com.mycodefu.bitsbytes;

import java.nio.charset.Charset;

public class Byteplay {
public static void main(String[] args) {
byte[] bytes = new byte[256];
for(byte i = -128; i < 127; i+=1) {
bytes[i+128] = i;
System.out.printf("adding byte %d: %s\n", i, (char)i);
	}
	System.out.println(new String(bytes, Charset.forName("UTF-8")));
}
}
