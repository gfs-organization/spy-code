package com.gfs.spycode;

import java.nio.charset.StandardCharsets;

public class CrackTheCode {

    public String solution(final String encodedText) {
        var encodedTextBytes = encodedText.getBytes(StandardCharsets.US_ASCII);
        var results = new byte[encodedText.length()];

        for (var i = 0; i < encodedText.length(); i++) {
            if ((encodedTextBytes[i] % 2 == 0)) {
                results[i] = encodedTextBytes[i] += 1;
            } else {
                results[i] = encodedTextBytes[i] -= 1;
            }
        }
        return new String(results);
    }

}
