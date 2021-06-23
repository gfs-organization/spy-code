package com.gfs.spycode;

import java.nio.charset.StandardCharsets;

public class CrackTheCode {

    public String solution(final String encodedText) {
        byte[] decodedChars = new byte[encodedText.length()];
        int counter = 0;
        for (int c : encodedText.toCharArray()) {
            if (c % 2 == 0) {
                decodedChars[counter] = (byte) (char) (c + 1);
            } else {
                decodedChars[counter] = (byte) (char) (c - 1);
            }
            counter++;
        }

        return new String(decodedChars, StandardCharsets.US_ASCII);
    }

}
