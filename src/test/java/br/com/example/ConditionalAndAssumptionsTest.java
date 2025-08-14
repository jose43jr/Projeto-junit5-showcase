package br.com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class ConditionalAndAssumptionsTest {

    @Test @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    void onlyOnDesktopLikeOS() { assertTrue(System.getProperty("os.name").length() > 0); }

    @Test void assumptionExample() {
        boolean ci = Boolean.parseBoolean(System.getenv().getOrDefault("CI", "false"));
        assumeFalse(ci, "pular no CI");
        assertEquals(4, 2 + 2);
    }
}
