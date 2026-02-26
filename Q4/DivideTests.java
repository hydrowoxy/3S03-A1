/** 
 * 
 * I have again commented out this class because 
 * I do not want to see my screen light up red with an exorbitant amount of 
 * red squiggly error lines




public class DivideTests {

    // These tests were added in part a)

    @Test
    public void div_twoInts(){
        Calculator c = new Calculator();
        assertEquals(2.0, c.divide(6.0, 3.0), 1e-9);
    }

    @Test
    public void div_byZero(){
        Calculator c = new Calculator();
        assertThrows(ArithmeticException.class, () -> c.divide(5.0, 0.0));
    }

    // These tests were added in part d)

    @Test
    public void div_negativeDividend(){
        Calculator c = new Calculator();
        assertEquals(-2.0, c.divide(-6.0, 3.0), 1e-9);
    }

    @Test
    public void div_negativeDivisor(){
        Calculator c = new Calculator();
        assertEquals(-2.0, c.divide(6.0, -3.0), 1e-9);
    }

    @Test
    public void div_zeroDividend(){
        Calculator c = new Calculator();
        assertEquals(0.0, c.divide(0.0, 5.0), 1e-9);
    }

    @Test
    public void div_fractionalResult(){
        Calculator c = new Calculator();
        assertEquals(2.5, c.divide(5.0, 2.0), 1e-9);
    }

    @Test
    public void div_nearZeroDivisor_throwsException(){
        Calculator c = new Calculator();
        assertThrows(ArithmeticException.class, () -> c.divide(1.0, 1e-15));
    }
}

*/