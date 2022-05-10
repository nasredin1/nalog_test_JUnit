import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProgressiveTaxTypeTest {

    private ProgressiveTaxType progressiveTaxType;

    @Test
    void testCalculateTaxFor1() {
        ProgressiveTaxType number = new ProgressiveTaxType();
        double sum = number.calculateTaxFor(100000);
        double result = 10000;
        assertEquals(result, sum);
    }
    @Test
    void testCalculateTaxFor2() {
        ProgressiveTaxType number = new ProgressiveTaxType();

        double sum = number.calculateTaxFor(100001);
        double result = 15000.15;
        assertEquals(result, sum);
    }


}