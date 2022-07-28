package com.ironhack.practiceOne.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringerHelperTest {

    StringerHelper stringerHelper = new StringerHelper();
    @Test
    void reverse_HolaInput_Exception() {
        assertEquals("aloH", stringerHelper.reverse("Hola"));
    }

    @Test
    void encoder_NoVowels_ThrowException() {
        assertThrows(RuntimeException.class, () -> {stringerHelper.encoder("plmn");});
    }

    @Test
    void encoder_SentenceWithVowels_CorrectAnswer() {
        assertEquals("H0l4", StringerHelper.encoder("Hola"));
    }

    @Test
    void encoder_EmptySentence_ThrowExcetion() {
        assertThrows(RuntimeException.class, () -> {stringerHelper.encoder("");});
    }


}