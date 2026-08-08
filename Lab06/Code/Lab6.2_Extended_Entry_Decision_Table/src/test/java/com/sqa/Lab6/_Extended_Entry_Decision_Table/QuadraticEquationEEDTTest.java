package com.sqa.Lab6._Extended_Entry_Decision_Table;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationEEDTTest {

    private QuadraticEquation quadraticEquation;

    @BeforeEach
    void setUp() {
        quadraticEquation = new QuadraticEquation();
    }

    @ParameterizedTest(name = "Rule#{0} ({1}): a={2}, b={3}, c={4} -> Expected: {5}")
    @CsvSource({
        "1, TC001, 0, 5, 2, NOT_QUADRATIC",
        "2, TC002, 1, 5, 2, REAL_ROOTS",
        "3, TC003, 1, 2, 1, EQUAL_ROOTS",
        "4, TC004, 1, 1, 5, IMAGINARY_ROOTS"
    })
    @DisplayName("Test determineRootNature based on Extended Entry Decision Table")
    void testDetermineRootNatureEEDT(String rule, String tcId, int a, int b, int c, RootNature expectedNature) {
        RootNature actualNature = quadraticEquation.determineRootNature(a, b, c);
        assertEquals(expectedNature, actualNature);
    }
}