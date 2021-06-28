package com.gfs.spycode;

public class CrackTheCode {

    public String solution(final String encodedText) {
        final char[] code = encodedText.toCharArray();
        for (int i = code.length - 1; i > -1; --i) {
            code[i] = (char) (code[i] + ((((code[i] + 1) % 2))) - (code[i] % 2));
        }
        return String.valueOf(code);
    }

}
