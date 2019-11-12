package test.roman;
import es.roman.RomanNumeral;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import javax.naming.NamingException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToRomanNumeralTest {

    @Test
    void zeroIsEmptyString() {
        check(0, "");
    }

    private void check(int i, String s) {
        RomanNumeral romanNumeral = new RomanNumeral(i);
        assertEquals(s, romanNumeral.toString());
    }

    @Test void oneIsI() { check(1, "I"); }

    @Test void twoIsII() { check(2, "II"); }

    @Test void threeIsIII() { check(3, "III"); }

    @Test void fourIsIV() { check(4, "IV"); }

    @Test void fiveIsV() { check(5, "V"); }

    @Test void sixIsVI() { check(6, "VI"); }

    @Test void sevenInVII() { check(7, "VII"); }

    @Test void eightIsVIII() { check(8, "VIII"); }

    @Test void nineIsIX() { check(9, "IX"); }

    @Test void tenIsX() { check(10, "X"); }

    @Test void elevenIsXI() { check(11, "XI"); }

    @Test void twelveIsXII() { check(12, "XII"); }

    @Test void thirteenIsXIII() { check(13, "XIII"); }

    @Test void fourteenIsXIV() { check(14, "XIV"); }

    @Test void fifteenIsXV() { check(15, "XV"); }

    @Test void sixteenIsXVI() { check(16, "XVI"); }

    @Test void seventeenIsXVII() { check(17, "XVII"); }

    @Test void eighteenIsXVIII() { check(18, "XVIII"); }

    @Test void nineteenIsXIX() { check(19, "XIX"); }

    @Test void twentyIsXX() { check(20, "XX"); }

    @Test void twentyoneIsXXI() { check(21, "XXI"); }

    @Test void twentyfourIsXXIV() { check(24, "XXIV"); }

    @Test void twentyfiveIsXXV() {check(25, "XXV"); }

    @Test void twentyeightIsXXVIII() { check(28, "XXVIII"); }

    @Test void twentynineIsXXXIX() { check(29, "XXIX"); }

    @Test void thirtyIsXXX() { check(30, "XXX"); }

}