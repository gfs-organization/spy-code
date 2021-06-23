package com.gfs.spycode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
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
        final String solution = target.solution("The sly grey fox ran fast.");
        final String expected = "Uid!rmx!fsdx!gny!s`o!g`ru/";
        assertThat(solution, is(expected));

        assertEquals(expected, solution);
    }

    @Test
    public void shouldEncode() {
        final String solution = target.solution("Uid!rmx!fsdx!gny!s`o!g`ru/");
        final String expected = "The sly grey fox ran fast.";
        assertThat(solution, is(expected));
    }

    @Test
    public void shouldDecodeMedium() {
        assertThat(target.solution("One Ring to rule them all, One Ring to find them, One Ring to bring them all, and in the darkness bind them"),
                is("Nod!Shof!un!stmd!uidl!`mm-!Nod!Shof!un!ghoe!uidl-!Nod!Shof!un!cshof!uidl!`mm-!`oe!ho!uid!e`sjodrr!choe!uidl"));

    }

    @Test
    public void shouldEncodeMedium() {
        assertThat(target.solution("Nod!Shof!un!stmd!uidl!`mm-!Nod!Shof!un!ghoe!uidl-!Nod!Shof!un!cshof!uidl!`mm-!`oe!ho!uid!e`sjodrr!choe!uidl"),
                is("One Ring to rule them all, One Ring to find them, One Ring to bring them all, and in the darkness bind them"));

    }

}