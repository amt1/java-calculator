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
    public void canDivideIntResult(){
        assertEquals(8, calculator.divideIntResult(25,3));
    }

    @Test
    public void canDivideFloatResult(){
        assertEquals(8.33, calculator.divideFloatResult(25, 3), 0.01);
    }
}
