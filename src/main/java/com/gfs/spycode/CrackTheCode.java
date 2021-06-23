package com.gfs.spycode;

public final class CrackTheCode {

    public final String solution(final String testString) {
        final byte[] chars = testString.getBytes();
        int index = 0;
        while (index < chars.length) {
            chars[index] -= 2 * (chars[index] % 2) - 1;
            index++;
        }
        return new String(chars);
    }
}
