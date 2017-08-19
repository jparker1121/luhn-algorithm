package algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/*
    All number sequences are from the PalPay test credit card numbers
    from https://www.paypalobjects.com/en_US/vhelp/paypalmanager_help/credit_card_numbers.htm
 */
public class LuhnTest {

    @Test
    public void luhnTest_isValid_AmericanExpress_True() {
        assertTrue(Luhn.isValid("378282246310005"));
    }

    @Test
    public void luhnTest_isValid_Mastercard_True() {
        assertTrue(Luhn.isValid("5555555555554444"));
    }

    @Test
    public void luhnTest_isValid_Visa_True() {
        assertTrue(Luhn.isValid("4012888888881881"));
    }

    @Test
    public void luhnTest_isValid_Discover_True() {
        assertTrue(Luhn.isValid("6011000990139424"));
    }
}