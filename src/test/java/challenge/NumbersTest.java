package challenge;

import challenge.exception.InvalidPositionException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class NumbersTest {

    private int[] numbers = {23, 74, 12, 11, 39, 2, 49, 73, 11, 111, 32, 19, -1};
    private int[] ascendingSortedNumbers = {-1, 2, 11, 11, 12, 19, 23, 32, 39, 49, 73, 74 ,111};
    private int[] descendingSortedNumbers = {111, 74, 73, 49, 39, 32, 23, 19, 12, 11, 11, 2, -1};

    @Test(expected = InvalidPositionException.class)
    public void test1() throws InvalidPositionException {
        Numbers.findNShortest(numbers, 340);
    }

    @Test(expected = InvalidPositionException.class)
    public void test2() throws InvalidPositionException {
        Numbers.findNLargest(numbers, 340);
    }

    @Test(expected = InvalidPositionException.class)
    public void test3() throws InvalidPositionException {
        Numbers.findNLargest(numbers, -1);
    }

    @Test(expected = InvalidPositionException.class)
    public void test4() throws InvalidPositionException {
        Numbers.findNShortest(numbers, -1);
    }

    @Test
    public void test5() throws InvalidPositionException {
        int result = Numbers.findNLargest(numbers, 1);
        assertEquals(result, 111);
    }

    @Test
    public void test6() throws InvalidPositionException{
        int result = Numbers.findNShortest(numbers, 2);
        assertEquals(result, 2);
    }

    @Test
    public void test7() throws InvalidPositionException{
        int result = Numbers.findNShortest(numbers, 3);
        assertEquals(result, 11);
    }

    @Test
    public void test8() throws InvalidPositionException  {
        int result = Numbers.findNLargest(numbers, 3);
        assertEquals(result, 73);
    }

    @Test
    public void test9() throws InvalidPositionException {
        int result = Numbers.findNShortest(numbers, 7);
        assertEquals(result, 23);
    }

    @Test
    public void test10() throws InvalidPositionException  {
        int result = Numbers.findNLargest(numbers, 5);
        assertEquals(result, 39);
    }

    @Test
    public void test11() throws InvalidPositionException {
        int result = Numbers.findNShortest(numbers, 1);
        assertEquals(result, -1);
    }

    @Test
    public void test12() {
        boolean result = Numbers.contains(numbers, 11);
        assertTrue(result);
    }

    @Test
    public void test13() {
        boolean result = Numbers.contains(numbers, 390);
        assertFalse(result);
    }

    @Test
    public void test14() {
        int[] result = Numbers.ascendingSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            assertEquals(result[i], ascendingSortedNumbers[i]);
        }
    }

    @Test
    public void test15() {
        int[] result = Numbers.descendingSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            assertEquals(result[i], descendingSortedNumbers[i]);
        }
    }
}
