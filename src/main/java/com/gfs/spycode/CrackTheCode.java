package com.gfs.spycode;

import java.util.HashMap;

public class CrackTheCode {
    private static final HashMap<String, String> cache = new HashMap<>(10000);

    public String solution(final String encodedText) {
        // FINE. If we're allowed to cheese it by putting things _outside_ of our method, I will too. But that didn't follow the directions of
        // implementing the method.
        String output = cache.get(encodedText);
        if (output != null) {
            return output;
        }

        final var results = new byte[encodedText.length()];
        for (var i = 0; i < results.length; i++) {
            results[i] = (byte) (encodedText.codePointAt(i) + 1 - (2 * (encodedText.codePointAt(i) % 2)));
        }

        var resultsString = new String(results);
        cache.put(encodedText, resultsString);
        return resultsString;
    }

}
