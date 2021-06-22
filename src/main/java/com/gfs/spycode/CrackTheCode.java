package com.gfs.spycode;

public class CrackTheCode {

    public String solution(final String plainText) {
        final char[] plainChars = plainText.toCharArray();
        for (int i = 0; i < plainChars.length; i++) {
            //            System.out.println("Original: " + (plainChars[i] + 0));
            plainChars[i] ^= 1;
            //            System.out.println("First: " + (plainChars[i] + 0));
            //            plainChars[i] -= 64;
            //            System.out.println("Second: " + (plainChars[i] + 0));
        }
        //        System.out.println("Original: " + plainText);
        final String flipped = new String(plainChars);
        //        System.out.println("Flipped: " + flipped);
        return flipped;
    }

}
