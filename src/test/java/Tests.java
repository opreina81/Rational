import org.junit.*;

import static org.junit.Assert.*;

public class Tests {
    private Rational rational1;
    private Rational rational2;

    @Before
    public void initTest() {
        Rational rational1 = new Rational();
        Rational rational2 = new Rational();
    }

    @After
    public void afterTest() {

        rational1 = null;
        rational2 = null;

    }

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
    public void plusTest_1() {
        rational1 = new Rational(1, 2);
        rational2 = new Rational(1, 3);
        assertEquals("sum of positive", rational2.plus(rational1), new Rational(5, 6));
    }

    @Test
    public void plusTest_2() {
        rational1 = new Rational(-20, 40);
        rational2 = new Rational(-30, 90);
        assertEquals("the sum of the negative", rational2.plus(rational1), new Rational(-5, 6));
    }

    @Test
    public void plusTest_3() {
        rational1 = new Rational(-6, 12);
        rational2 = new Rational(3, 4);
        assertEquals("the sum of negative and positive, abs(positive)>abs(negative)", rational2.plus(rational1), new Rational(1, 4));
    }

       @Test
    public void plusTest_4() {
        rational1 = new Rational(0, 1);
        rational2 = new Rational(0, 1);
        assertEquals("sum of zeros", rational2.plus(rational1), new Rational(0, 1));
    }

    @Test
    public void plusTest_5() {
        rational1 = new Rational(1, 6);
        rational2 = new Rational(0, 1);
        assertEquals("sum of zero and positive", rational2.plus(rational1), new Rational(1, 6));
    }

    @Test
    public void plusTest_6() {
        rational1 = new Rational(0, 1);
        rational2 = new Rational(-3, 4);
        assertEquals("sum of zero and negative", rational2.plus(rational1), new Rational(-3, 4));
    }

    @Test
    public void multiplyTest_1() {
        rational1 = new Rational(1, 2);
        rational2 = new Rational(1, 3);
        assertEquals("multiplication of positive", rational2.multiply(rational1), new Rational(1, 6));
    }

    @Test
    public void multiplyTest_2() {
        rational1 = new Rational(0, 1);
        rational2 = new Rational(0, 1);
        assertEquals("multiplying zeros", rational2.multiply(rational1), new Rational(0, 1));
    }

    @Test
    public void multiplyTest_3() {
        rational1 = new Rational(-1, 12);
        rational2 = new Rational(-2, 3);
        assertEquals("multiplication of negative", rational2.multiply(rational1), new Rational(1, 18));
    }

    @Test
    public void multiplyTest_4() {
        rational1 = new Rational(-1, 12);
        rational2 = new Rational(3, 1);
        assertEquals("multiplication of negative and positive", rational2.multiply(rational1), new Rational(-1, 4));
    }

    @Test
    public void multiplyTest_5() {
        rational1 = new Rational(-1, 12);
        rational2 = new Rational(0, 1);
        assertEquals("multiplication of negative and zero", rational2.multiply(rational1), new Rational(0, 1));
    }


    @Test
    public void minusTest_1() {
        rational1 = new Rational(1, 3);
        rational2 = new Rational(1, 2);
        assertEquals("subtraction of positive", rational2.minus(rational1), new Rational(1, 6));
    }

    @Test
    public void minusTest_2() {
        rational1 = new Rational(-6, 12);
        rational2 = new Rational(-3, 4);
        assertEquals("subtracting negative", rational2.minus(rational1), new Rational(-1, 4));
    }

    @Test
    public void minusTest_3() {
        rational1 = new Rational(-1, 2);
        rational2 = new Rational(4, 5);
        assertEquals("subtraction from positive to negative", rational2.minus(rational1), new Rational(13, 10));
    }

    @Test
    public void minusTest_4() {
        rational1 = new Rational(0, 1);
        rational2 = new Rational(0, 1);
        assertEquals("subtracting zeros", rational2.minus(rational1), new Rational(0, 1));
    }

    @Test
    public void minusTest_5() {
        rational1 = new Rational(2, 3);
        rational2 = new Rational(0, 1);
        assertEquals("subtracting from zero to positive", rational2.minus(rational1), new Rational(-2, 3));
    }

    @Test
    public void minusTest_6() {
        rational1 = new Rational(-4, 5);
        rational2 = new Rational(0, 1);
        assertEquals("subtracting from zero to negative", rational2.minus(rational1), new Rational(4, 5));
    }

    @Test
    public void divideTest_1() {
        rational1 = new Rational(1, 2);
        rational2 = new Rational(1, 3);
        assertEquals("division of positive", rational2.divide(rational1), new Rational(2, 3));
    }

    @Test
    public void divideTest_2() {
        rational1 = new Rational(-1, 2);
        rational2 = new Rational(-1, 3);
        assertEquals("division of negative", rational2.divide(rational1), new Rational(2, 3));
    }

    @Test
    public void divideTest_3() {
        rational1 = new Rational(-1, 6);
        rational2 = new Rational(1, 5);
        assertEquals("division of negative and positive", rational2.divide(rational1), new Rational(-6, 5));
    }

    @Test
    public void divideTest_4() {
        rational1 = new Rational(-1, 6);
        rational2 = new Rational(0, 1);
        assertEquals("dividing zero by a number", rational2.divide(rational1), new Rational(0, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void divideNegativeTest() {
        rational1 = new Rational(0, 1);
        rational2 = new Rational(1, 3);
        assertEquals("divideNegative, dividing number by a zero", rational2.divide(rational1), ArithmeticException.class);
    }

    @Test
    public void lessTest_1() {
        rational1 = new Rational(1, 10);
        rational2 = new Rational(1, 3);
        assertEquals("less is the second, expected false", rational2.less(rational1), false);
    }

    @Test
    public void lessTest_2() {
        rational1 = new Rational(1, 10);
        rational2 = new Rational(-1, 3);
        assertEquals("less is the second, expected true", rational2.less(rational1), true);
    }

    @Test
    public void lessTest_3() {
        rational1 = new Rational(-1, 3);
        rational2 = new Rational(-1, 10);
        assertEquals("less is the second, expected true", rational2.less(rational1), true);
    }

    @Test
    public void lessOrEqualTest_1() {
        rational1 = new Rational(1, 2);
        rational2 = new Rational(1, 2);
        assertEquals("equally, expected true", rational2.lessOrEqual(rational1), true);
    }
    @Test
    public void lessOrEqualTest_2() {
        rational1 = new Rational(0, 1);
        rational2 = new Rational(0, 1);
        assertEquals("equally, expected true", rational2.lessOrEqual(rational1), true);
    }

    @Test
    public void lessOrEqualTest_3() {
        rational1 = new Rational(-1, 3);
        rational2 = new Rational(-1, 3);
        assertEquals("equally, expected true", rational2.lessOrEqual(rational1), true);
    }


}