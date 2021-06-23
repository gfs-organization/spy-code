package com.gfs.spycode;

public class CrackTheCode {
    public String solution(final String encodedText) {
        char[] chars = encodedText.toCharArray();
        int length = encodedText.length();
        char[] decodedText = new char[length];

        for (int i = 0; i < chars.length; i++) {
            int charDecimal = chars[i];
            // If the char's ascii value is even, go up one, otherwise go down one
            if (charDecimal % 2 == 0) {
                decodedText[i] = (char) (charDecimal + 1);
            } else {
                decodedText[i] = (char) (charDecimal - 1);
            }
        }

        return String.valueOf(decodedText, 0, length);
    }
}