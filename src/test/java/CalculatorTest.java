import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtract(8,3));
    }

    @Test
    public void canSubtractNegative(){
        assertEquals(-5, calculator.subtract(3,8));
    }
    @Test
    public void canMultiply(){
        assertEquals(24, calculator.multiply(8,3));
    }

    @Test
    public void canDivide(){
        assertEquals(8, calculator.divide(25,3), 0.01);
    }

    @Test
    public void canDivideFloat(){
        assertEquals(8.333333015441895, calculator.divide(25, 3), 0.01);
    }
}
