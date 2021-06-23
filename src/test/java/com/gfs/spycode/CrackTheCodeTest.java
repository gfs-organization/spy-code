package com.gfs.spycode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CrackTheCodeTest {

    private CrackTheCode target;

    @Before
    public void setup() {
        target = new CrackTheCode();
    }

    @Test
    public void shouldDecode() {
        final String encodedText = "The sly grey fox ran slow.";
        final String solution = target.solution(encodedText);
        final String expected = "Uid!rmx!fsdx!gny!s`o!rmnv/";
        assertThat(solution, is(expected));
    }

    @Test
    public void shouldEncode() {
        final String encodedText = "Uid!rmx!fsdx!gny!s`o!g`ru/";
        final String solution = target.solution(encodedText);
        final String expected = "The sly grey fox ran fast.";
        assertThat(solution, is(expected));
    }

    @Test
    public void shouldDecodeMedium() {
        final String encodedText = "One Ring to rule them all, One Ring to find them, One Ring to bring them all, and in the darkness blind them";
        final String expected = "Nod!Shof!un!stmd!uidl!`mm-!Nod!Shof!un!ghoe!uidl-!Nod!Shof!un!cshof!uidl!`mm-!`oe!ho!uid!e`sjodrr!cmhoe!uidl";
        assertThat(target.solution(encodedText), is(expected));

    }

    @Test
    public void shouldEncodeMedium() {
        final String encodedText = "Nod!Shof!un!stmd!uidl!`mm-!Nod!Shof!un!ghoe!uidl-!Nod!Shof!un!cshof!uidl!`mm-!`oe!ho!uid!e`sjodrr!choe!uidl";
        final String expected = "One Ring to rule them all, One Ring to find them, One Ring to bring them all, and in the darkness bind them";
        assertThat(target.solution(encodedText), is(expected));

    }

}