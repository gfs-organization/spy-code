package com.gfs.spycode;

import java.math.BigInteger;
import java.util.Arrays;

public final class CrackTheCode {

    public final String solution(final String testString) {
        final byte[] bytes = testString.getBytes();
        final byte[] xorPatternBytes = new byte[bytes.length];
        Arrays.fill(xorPatternBytes, (byte) 0x01);
        return new String(new BigInteger(bytes).xor(new BigInteger(xorPatternBytes)).toByteArray());
    }
}
