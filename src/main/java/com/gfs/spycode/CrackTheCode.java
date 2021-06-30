package com.gfs.spycode;

import java.nio.charset.StandardCharsets;

public class CrackTheCode {

    public String solution(final String encodedText) {
        byte[] b = new byte[encodedText.length()];
        byte[] b2 = encodedText.getBytes(StandardCharsets.UTF_8);
        for (int k = 0; k < b.length; k++) {
            b[k] = (byte) ((int) b2[k] + 1);
            b[k] -= (byte) ((int) b2[k] % 2 + (int) b2[k] % 2);
        }
        return new String(b, StandardCharsets.UTF_8);
    }

}
