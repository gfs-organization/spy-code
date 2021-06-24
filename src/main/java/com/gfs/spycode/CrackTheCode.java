package com.gfs.spycode;

public final class CrackTheCode {
    int currentChar = 0;

    public final String solution(final String testString) {
        final byte[] bytes = testString.getBytes();
        while (currentChar < bytes.length) {
            bytes[currentChar++] ^= 1;
        }
        currentChar = 0;
        return new String(bytes);
    }
}
