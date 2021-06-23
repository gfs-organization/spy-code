package com.gfs.spycode;

public class CrackTheCode {

    public String solution(final String encodedText) {
        final var results = new byte[encodedText.length()];
        for (var i = 0; i < results.length; i++) {
            results[i] = (byte) (encodedText.codePointAt(i) + 1 - (2 * (encodedText.codePointAt(i) % 2)));
        }
        return new String(results);
    }

}
