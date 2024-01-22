import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testEvaluatePostfixBasicOperations() {
        CalculatorPostfix calculator = new CalculatorPostfix();
        assertEquals(7, calculator.evaluatePostfix("3 4 +"));
        assertEquals(12, calculator.evaluatePostfix("3 4 *"));
        assertEquals(2, calculator.evaluatePostfix("6 3 /"));
        assertEquals(5, calculator.evaluatePostfix("8 3 -"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluatePostfixInvalidExpression() {
        CalculatorPostfix calculator = new CalculatorPostfix();
        calculator.evaluatePostfix("3 a +");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluatePostfixInsufficientOperands() {
        CalculatorPostfix calculator = new CalculatorPostfix();
        calculator.evaluatePostfix("3 +");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluatePostfixDivisionByZero() {
        CalculatorPostfix calculator = new CalculatorPostfix();
        calculator.evaluatePostfix("3 0 /");
    }
}

