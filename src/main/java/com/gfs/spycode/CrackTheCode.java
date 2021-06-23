package com.gfs.spycode;

public class CrackTheCode {

    public String solution(final String encodedText) {
        var results = new byte[encodedText.length()];

        for (var i = 0; i < encodedText.length(); i++) {
            if (encodedText.charAt(i) % 2 == 0) {
                results[i] = (byte) (encodedText.charAt(i) + 1);
            } else {
                results[i] = (byte) (encodedText.charAt(i) - 1);
            }
        }
        return new String(results);
    }

}
