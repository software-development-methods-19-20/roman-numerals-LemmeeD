package test.roman;
import es.roman.RomanNumeral;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import javax.naming.NamingException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToRomanNumeralTest {

    @Test
    void zeroIsEmptyString() {
        RomanNumeral romanNumeral = new RomanNumeral(0);
        assertEquals("", romanNumeral.toString());
    }

    @Test
    void oneIsI() {
        RomanNumeral romanNumeral = new RomanNumeral(1);
        assertEquals("I", romanNumeral.toString());
    }
}