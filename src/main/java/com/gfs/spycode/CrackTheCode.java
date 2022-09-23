package com.gfs.spycode;

public class CrackTheCode {

    public String solution(final String plainText) {
        final byte[] plainChars = plainText.getBytes();
        for (int i = 0; i < plainChars.length; i++) {
            plainChars[i] ^= 1;
            
            System.out.println("help");
        }
        return new String(plainChars);
    }

}
