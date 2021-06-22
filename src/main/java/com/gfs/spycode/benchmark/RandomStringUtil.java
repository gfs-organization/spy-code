package com.gfs.spycode.benchmark;

public class RandomStringUtil {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";

    public static String replaceRandomString(String input) {
        final int inputLength = input.length();
        final StringBuilder sb = new StringBuilder(inputLength);

        for (int i = 0; i < inputLength; i++) {

            if (Character.isLetter(input.charAt(i))) {
                int index = (int) (ALPHA_NUMERIC_STRING.length() * Math.random());
                sb.append(ALPHA_NUMERIC_STRING.charAt(index));
            } else {
                sb.append(input.charAt(i));
            }
        }

        return sb.toString();
    }
}
