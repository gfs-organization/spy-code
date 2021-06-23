package com.gfs.spycode;

import java.lang.reflect.Field;

public class CrackTheCode {
    public String solution(final String encodedText) {

        try {
            final Field field = String.class.getDeclaredField("value");
            field.setAccessible(true);
            final byte[] chars = (byte[]) field.get(encodedText);

            for (int i = chars.length - 1; i >= 0; i--) {
                chars[i] ^= 1;
            }
            return encodedText;
        } catch (final Exception thisIsAGoodIdea) {
            return thisIsAGoodIdea.toString();
        }
    }

}
