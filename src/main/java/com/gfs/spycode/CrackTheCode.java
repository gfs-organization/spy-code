package com.gfs.spycode;

public class CrackTheCode {

    public String solution(final String encodedText) {

        StringBuilder convertedTest = new StringBuilder();
        for (char digit : encodedText.toCharArray()) {
            int keycode = (int) digit;
            keycode = (keycode % 2 == 0) ? (keycode + 1) : (keycode - 1);
            convertedTest.append((char) keycode);
        }
        return convertedTest.toString();
    }
}