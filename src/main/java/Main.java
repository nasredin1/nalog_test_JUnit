

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        TaxType taxType = new TaxType();
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        VATaxType vATaxType = new VATaxType();
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();
        Bill[] payments = new Bill[]{
                new Bill(100, taxType, taxService),
                new Bill(524, incomeTaxType, taxService),
                new Bill(54878, vATaxType, taxService),
                new Bill(100000, progressiveTaxType, taxService),
                new Bill(100001, progressiveTaxType, taxService)
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }

    }
}
