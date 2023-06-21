import org.junit.*;

import static org.junit.Assert.*;

public class TestsCreationOfNumbers {


    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }

    @Test
    public void simplifyMinusesTest() {
        Rational simplifyMinusesRational = new Rational(3, -5);
        assertEquals("The constructor returns a negative numerator", -3, simplifyMinusesRational.getNumerator());
        assertEquals("The constructor returns a positive denominator", 5, simplifyMinusesRational.getDenominator());
    }

    @Test
    public void minusToPlusTest() {
        Rational minusToPlus = new Rational(-120, -133);
        assertEquals("The constructor returns a positive numerator", 120, minusToPlus.getNumerator());
        assertEquals("The constructor returns a positive denominator", 133, minusToPlus.getDenominator());
    }

    @Test
    public void reduceTest() {
        Rational reduceRational = new Rational(6, 4);
        assertEquals("The constructor returns the reduced numerator", 3, reduceRational.getNumerator());
        assertEquals("The constructor returns the reduced denominator", 2, reduceRational.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorTest() {
        Rational zeroDenominator = new Rational(3, 0);
        assertEquals("The constructor returns standard numerator", 3, zeroDenominator.getNumerator());
        assertEquals("The denominator is not zero", ArithmeticException.class, ArithmeticException.class);
    }

    @Test
    public void setNumeratorDenominatorTest() {
        Rational rational1 = new Rational();
        rational1.setNumerator(1);
        assertEquals("test of setNumerator", 1, rational1.getNumerator());
        rational1.setDenominator(2);
        assertEquals("test of setDenominator", 2, rational1.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void setNullDenominator() {
        Rational rational1 = new Rational();
        rational1.setDenominator(0);
        assertEquals("The denominator is not zero", ArithmeticException.class, ArithmeticException.class);
    }

}
