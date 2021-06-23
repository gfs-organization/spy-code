package com.gfs.spycode;

public class CrackTheCode {

    public String solution(final String encodedText) {
       
        char[] decodedChars = new char[encodedText.length()];
        int counter = 0;
        for (int c : encodedText.toCharArray()) {
            if (c % 2 == 0) {
                decodedChars[counter] = (char) (c + 1);
            } else {
                decodedChars[counter] = (char) (c - 1);
            }
            counter++;
        }

        return String.valueOf(decodedChars);
    }

}
