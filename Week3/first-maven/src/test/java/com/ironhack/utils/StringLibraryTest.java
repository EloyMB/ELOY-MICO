package com.ironhack.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringLibraryTest {
    StringLibrary stringLibrary = new StringLibrary();

    @Test
    public void concatenateName_NameAndSurname_NameConcatenated() {
        assertEquals("Iván Trujillo", stringLibrary.concatenateName("Iván", "Trujillo"));
    }

    @Test
    public void concatenateName_AtLeastOneEmptyString_ReturnOnlyNotEmptyName() {
        assertEquals("Iván", stringLibrary.concatenateName("Iván", ""));
        assertEquals("Trujillo", stringLibrary.concatenateName("", "Trujillo"));
        assertEquals("", stringLibrary.concatenateName("", ""));
    }

    @Test
    public void concatenateName_AtLeastOneNull_ReturnOnlyNotEmptyName() {
        assertEquals("Iván", stringLibrary.concatenateName("Iván", null));
        assertEquals("Trujillo", stringLibrary.concatenateName(null, "Trujillo"));
        assertEquals("", stringLibrary.concatenateName(null, null));
    }

    @Test
    public void concatenateName_StringWithNumberOrSpecialCharacters_EmptyString() {
        assertEquals("", stringLibrary.concatenateName("Iván9", "Trujillo"));
        assertEquals("", stringLibrary.concatenateName("Iván", "452"));
        assertEquals("", stringLibrary.concatenateName("Iván", "Trujillo@"));
        assertEquals("", stringLibrary.concatenateName("Iván", "Trujillo@."));
        assertEquals("", stringLibrary.concatenateName("Iván", "Trujillo@,"));
    }

}