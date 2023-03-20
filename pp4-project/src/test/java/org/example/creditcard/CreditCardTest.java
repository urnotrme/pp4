package org.example.creditcard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

public class CreditCardTest {
    @Test
    void itAllowsToAssignCreditLimit() {
        //Arrange
        CreditCard card = new CreditCard("1234-5678");
        //Act
        card.assignLimit(BigDecimal.valueOf(1000));
        //Assert // Then

        assertEquals(BigDecimal.valueOf(1000), card.getCurrentBalance());
    }

    @Test
    void itAllowsToAssignDifferentCreditLimit() {
        //Arrange
        CreditCard card1 = new CreditCard("1234-5678");
        CreditCard card2 = new CreditCard("1234-5679");
        //Act
        card1.assignLimit(BigDecimal.valueOf(1000));
        card2.assignLimit(BigDecimal.valueOf(1100));
        //Assert // Then
        assertEquals(BigDecimal.valueOf(1000), card1.getCurrentBalance());
        assertEquals(BigDecimal.valueOf(1100), card2.getCurrentBalance());
    }

    @Test
    void itDenyLimitsBelow100() {
        CreditCard card = new CreditCard("1234-5678");
        try {
            card.assignLimit(BigDecimal.valueOf(10));
            fail("Should throw exception");
        } catch (CreditBelowTresholdException e) {
            assertTrue(true);
        }
        assertThrows(
                CreditBelowTresholdException.class,
                () -> card.assignLimit(BigDecimal.valueOf(10)));
        assertThrows(
                CreditBelowTresholdException.class,
                () -> card.assignLimit(BigDecimal.valueOf(99)));

    }
    @Test
    void testDoubleAndFloats() {

    }
}
