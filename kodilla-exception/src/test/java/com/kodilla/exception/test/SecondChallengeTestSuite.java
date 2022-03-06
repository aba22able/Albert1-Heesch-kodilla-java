package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTestSuite {

    @Test
    void probablyIWillThrowExceptionTest() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 0));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 0));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 0));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.99, 1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 0));
    }
}