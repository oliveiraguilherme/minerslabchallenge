package challenge;

import challenge.exception.InvalidFibonacciInputException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class FibonacciTest {

    @Test
    public void shouldReturnFibonacciSequenceTo0() throws InvalidFibonacciInputException {
        long result = Fibonacci.calculate(0);
        assertEquals(result, 0);
    }

    @Test
    public void shouldReturnFibonacciSequenceTo2() throws InvalidFibonacciInputException {
        long result = Fibonacci.calculate(2);
        assertEquals(result, 1);
    }

    @Test
    public void shouldReturnFibonacciSequenceTo8() throws InvalidFibonacciInputException {
        long result = Fibonacci.calculate(8);
        assertEquals(result, 21);
    }

    @Test
    public void shouldReturnFibonacciSequenceTo12() throws InvalidFibonacciInputException {
        long result = Fibonacci.calculate(12);
        assertEquals(result, 144);
    }

    @Test
    public void shouldReturnFibonacciSequenceTo18() throws InvalidFibonacciInputException {
        long result = Fibonacci.calculate(18);
        assertEquals(result, 2584);
    }

    @Test
    public void shouldReturnFibonacciSequenceTo22() throws InvalidFibonacciInputException {
        long result = Fibonacci.calculate(22);
        assertEquals(result, 17711);
    }

    @Test(expected = InvalidFibonacciInputException.class)
    public void shouldReturnFibonacciSequenceToNegativeNumber() throws InvalidFibonacciInputException {
        Fibonacci.calculate(-1);
    }

}
