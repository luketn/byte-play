package com.mycodefu.bitsbytes;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Shrinker {
public static void main(String[] args) {
	double x = 1023.571428571428571428;
	TestMessageType messageType = TestMessageType.one;
	ByteBuffer buffer = ByteBuffer.allocate(3).putShort((short)(x*10)).put(messageType.getCode()).flip();
	double xShortened = ((double)buffer.getShort())/10;
	TestMessageType decodedMessageType = TestMessageType.forCode(buffer.get());
	double scaleAmount = 3.75;
	System.out.printf("shortened double: %s, scaled: %s\n original: %s, scaled: %s\n decoded message type: %s", xShortened+"", xShortened*scaleAmount+"", x+"", x*scaleAmount, decodedMessageType.name());
}

public static enum TestMessageType {
	one((byte)1),
	two((byte)2),
	three((byte)3),
	four((byte)4);
private byte code;

private TestMessageType(byte code) {
	this.code = code;
}

public byte getCode() {
	return code;
}

private static Map<Byte, TestMessageType> codeToValue = new ConcurrentHashMap<>();
private static boolean hasFilledMap = false;
private static Object lockObject = new Object();
public static TestMessageType forCode(Byte b) {
	if(!hasFilledMap) {
		synchronized (lockObject) {
			if(!hasFilledMap) {
				for(TestMessageType messageType : TestMessageType.values()) {
					codeToValue.put(messageType.code, messageType);
				}
				hasFilledMap = true;
			}
		}
	}
	return codeToValue.get(b);
}
}
}
