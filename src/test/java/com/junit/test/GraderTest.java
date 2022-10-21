package com.junit.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void sixtySixShouldReturnD(){
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(66));
    }

    @Test
    void seventyeightShouldReturnC(){
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(78));
    }

    @Test
    void eightyNineShouldReturnB(){
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGrade(-1);
                });

    }
}