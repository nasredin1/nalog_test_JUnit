import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VATaxTypeTest {

    @Test
    void testCalculateTaxFor() {

        VATaxType number = new VATaxType();
        double sum = number.calculateTaxFor(54878);
        double result = 54878 * 0.18;
        assertEquals(sum, result);


    }
}