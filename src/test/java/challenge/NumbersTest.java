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
    public void shouldThrowExceptionDueInvalidPositionInShortest() throws InvalidPositionException {
        Numbers.findNShortest(numbers, 340);
    }

    @Test(expected = InvalidPositionException.class)
    public void shouldThrowExceptionDueInvalidPositionInLargest() throws InvalidPositionException {
        Numbers.findNLargest(numbers, 340);
    }

    @Test(expected = InvalidPositionException.class)
    public void shouldThrowExceptionDueNegativePositionInLargest() throws InvalidPositionException {
        Numbers.findNLargest(numbers, -1);
    }

    @Test(expected = InvalidPositionException.class)
    public void shouldThrowExceptionDueNegativePositionInShortest() throws InvalidPositionException {
        Numbers.findNShortest(numbers, -1);
    }

    @Test
    public void shouldReturnTheLargestNumber() throws InvalidPositionException {
        int result = Numbers.findNLargest(numbers, 1);
        assertEquals(result, 111);
    }

    @Test
    public void shouldReturnTheSecondShortestNumber() throws InvalidPositionException{
        int result = Numbers.findNShortest(numbers, 2);
        assertEquals(result, 2);
    }

    @Test
    public void shouldReturnTheThirdShortestNumber() throws InvalidPositionException{
        int result = Numbers.findNShortest(numbers, 3);
        assertEquals(result, 11);
    }

    @Test
    public void shouldReturnTheThirdLargestNumber() throws InvalidPositionException  {
        int result = Numbers.findNLargest(numbers, 3);
        assertEquals(result, 73);
    }

    @Test
    public void shouldReturnTheSeventhShortestNumber() throws InvalidPositionException {
        int result = Numbers.findNShortest(numbers, 7);
        assertEquals(result, 23);
    }

    @Test
    public void shouldReturnTheFifthLargestNumber() throws InvalidPositionException  {
        int result = Numbers.findNLargest(numbers, 5);
        assertEquals(result, 39);
    }

    @Test
    public void shouldReturnTheShortestNumber() throws InvalidPositionException {
        int result = Numbers.findNShortest(numbers, 1);
        assertEquals(result, -1);
    }

    @Test
    public void shouldFindNumberInArray() {
        boolean result = Numbers.contains(numbers, 11);
        assertTrue(result);
    }

    @Test
    public void shouldNotFindNumberInArray() {
        boolean result = Numbers.contains(numbers, 390);
        assertFalse(result);
    }

    @Test
    public void shouldAscendingSortList() {
        int[] result = Numbers.ascendingSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            assertEquals(result[i], ascendingSortedNumbers[i]);
        }
    }

    @Test
    public void shouldDescendingSortList() {
        int[] result = Numbers.descendingSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            assertEquals(result[i], descendingSortedNumbers[i]);
        }
    }
}
