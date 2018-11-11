package challenge;

import challenge.exception.InvalidFibonacciInputException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class FibonacciTest {

    @Test
    public void test1() throws InvalidFibonacciInputException {
        long result = Fibonacci.calculate(0);
        assertEquals(result, 0);
    }

    @Test
    public void test2() throws InvalidFibonacciInputException {
        long result = Fibonacci.calculate(2);
        assertEquals(result, 1);
    }

    @Test
    public void test3() throws InvalidFibonacciInputException {
        long result = Fibonacci.calculate(8);
        assertEquals(result, 21);
    }

    @Test
    public void test4() throws InvalidFibonacciInputException {
        long result = Fibonacci.calculate(12);
        assertEquals(result, 144);
    }

    @Test
    public void test5() throws InvalidFibonacciInputException {
        long result = Fibonacci.calculate(18);
        assertEquals(result, 2584);
    }

    @Test
    public void test6() throws InvalidFibonacciInputException {
        long result = Fibonacci.calculate(22);
        assertEquals(result, 17711);
    }

    @Test(expected = InvalidFibonacciInputException.class)
    public void test7() throws InvalidFibonacciInputException {
        Fibonacci.calculate(-1);
    }

}
