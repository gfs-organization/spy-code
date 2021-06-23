package com.gfs.spycode;

public class CrackTheCode {

    public String solution(final String encodedText) {

        final char[] buffer = encodedText.toCharArray();

        for (int i = 0; i < buffer.length; i++) {
            buffer[i] ^= 1;
        }

        return new String(buffer);
    }

}
