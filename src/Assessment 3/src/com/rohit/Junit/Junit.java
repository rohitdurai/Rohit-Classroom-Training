package com.rohit.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Junit {
    public static class SalaryCalculatorTest {

        SalaryCalculator sc = null;

        @Before
        public void setObject() {
            sc = new SalaryCalculator();
        }

        @Test
        public void sal() {
            double tax = sc.calcTax(350000, 0.085);
            assertEquals(4250, tax, 0.1);
        }

        @After
        public void tearDown() {
            sc = null;
        }
    }

    public static class SalaryCalculator {

            private static final double TAX_FREE = 0;

            public double calcTax(double salary, double taxRate) {
                double taxableSal = salary - TAX_FREE;
                if (taxableSal > 0)
                    return taxableSal * taxRate;
                else return 0;
            }

        }
}

/* Result mentioned below

java.lang.AssertionError:
Expected :4250.0
Actual   :29750.000000000004

 */
