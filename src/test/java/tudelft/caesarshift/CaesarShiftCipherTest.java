package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher caesar;

    @BeforeEach
    public void initialize() {
        caesar = new CaesarShiftCipher();
    }

    @Test
    public void shiftPositive1() {
        Assertions.assertEquals("bcd", caesar.CaesarShiftCipher("abc", 1));
    }

    @Test
    public void shiftPositive10() {
        Assertions.assertEquals("klm", caesar.CaesarShiftCipher("abc", 10));
    }

    @Test
    public void shiftMinus1() {
        Assertions.assertEquals("zab", caesar.CaesarShiftCipher("abc", -1));
    }

    @Test
    public void shiftMinus5() {
        Assertions.assertEquals("vwx", caesar.CaesarShiftCipher("abc", -5));
    }
}
