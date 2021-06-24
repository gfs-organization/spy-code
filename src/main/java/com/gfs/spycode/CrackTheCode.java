package com.gfs.spycode;

public class CrackTheCode {

    public String solution(final String encodedText) {

        final char[] buffer = encodedText.toCharArray();

        int i = buffer.length - 1;
        do {
            buffer[i] ^= 1;
            i--;
        } while (i >= 0);

        return new String(buffer);
    }

}
