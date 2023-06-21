import org.junit.*;

import static org.junit.Assert.*;

public class TestsOperationsOnNumbers {
    private Rational rational1;
    private Rational rational2;


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
        assertFalse("less is the second, expected false", rational2.less(rational1));
    }

    @Test
    public void lessTest_2() {
        rational1 = new Rational(1, 10);
        rational2 = new Rational(-1, 3);
        assertTrue("less is the second, expected true", rational2.less(rational1));
    }

    @Test
    public void lessTest_3() {
        rational1 = new Rational(-1, 3);
        rational2 = new Rational(-1, 2);
        assertTrue("less is the second, expected true", rational2.less(rational1));
    }

    @Test
    public void lessTest_4() {
        rational1 = new Rational(-1, 3);
        rational2 = new Rational(-2, 3);
        assertTrue("less is the second, expected true", rational2.less(rational1));
    }

    @Test
    public void lessTest_5() {
        rational1 = new Rational(1, 3);
        rational2 = new Rational(2, 3);
        assertFalse("less is the second, expected false", rational2.less(rational1));
    }

    @Test
    public void lessTest_6() {
        rational1 = new Rational(1, 3);
        rational2 = new Rational(-2, 3);
        assertTrue("less is the second, expected true", rational2.less(rational1));
    }
    @Test
    public void lessTest_7() {
        rational1 = new Rational(0, 3);
        rational2 = new Rational(1, 3);
        assertTrue("less is the first, expected true", rational2.less(rational1));
    }

    @Test
    public void lessOrEqualTest_1() {
        rational1 = new Rational(1, 2);
        rational2 = new Rational(1, 2);
        assertTrue("equally, expected true", rational2.lessOrEqual(rational1));
    }

    @Test
    public void lessOrEqualTest_2() {
        rational1 = new Rational(0, 1);
        rational2 = new Rational(0, 1);
        assertTrue("equally, expected true", rational2.lessOrEqual(rational1));
    }

    @Test
    public void lessOrEqualTest_3() {
        rational1 = new Rational(-1, 3);
        rational2 = new Rational(-1, 3);
        assertTrue("equally, expected true", rational2.lessOrEqual(rational1));
    }

    @Test
    public void lessOrEqualTest_4() {
        rational1 = new Rational(-1, 3);
        rational2 = new Rational(-1, 2);
        assertTrue("less is the second, expected true", rational2.lessOrEqual(rational1));
    }

    @Test
    public void lessOrEqualTest_5() {
        rational1 = new Rational(1, 2);
        rational2 = new Rational(1, 3);
        assertTrue("less is the second, expected true", rational2.lessOrEqual(rational1));
    }

    @Test
    public void lessOrEqualTest_6() {
        rational1 = new Rational(1, 3);
        rational2 = new Rational(-1, 3);
        assertTrue("less is the second, expected true", rational2.lessOrEqual(rational1));
    }

    @Test
    public void lessOrEqualTest_7() {
        rational1 = new Rational(1, 3);
        rational2 = new Rational(0, 3);
        assertTrue("less is the second, expected true", rational1.lessOrEqual(rational2));
    }

    @Test
    public void lessOrEqualTest_8() {
        rational1 = new Rational(-1, 3);
        rational2 = new Rational(0, 3);
        assertTrue("less is the first, expected true", rational1.lessOrEqual(rational2));
    }
}
