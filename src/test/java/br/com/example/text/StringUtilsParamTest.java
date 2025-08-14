package br.com.example.text;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsParamTest {

    // sem aspas internas no 'name'
    @ParameterizedTest(name = "[{index}] {0} tem texto?")
    @ValueSource(strings = {"a", " hello ", "0"})
    void hasTextTrue(String value) {
        assertTrue(StringUtils.hasText(value));
    }

    @ParameterizedTest
    @CsvSource({"ovo,true","Ana,true","Casa,false"})
    void palindrome(String input, boolean expected) {
        assertEquals(expected, StringUtils.isSimplePalindrome(input));
    }
}
