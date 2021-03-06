import static org.junit.Assert.*;

/**
 * Created by jessicatracy on 9/27/16.
 */
public class SortingRunnerTest {
    BaseSorter mySorter = new SelectionSorter();
    RecursionRunner myRunner = new RecursionRunner();

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void bubbleSort2ElementArray() throws Exception {
        int[] orderedArray = {12, 8};
        mySorter.sort(orderedArray);
        assert2ElementOrder(orderedArray);

        int[] scrambledArray1 = {8, 12};
        mySorter.sort(scrambledArray1);
        assert2ElementOrder(scrambledArray1);
    }

    private void assert2ElementOrder(int[] numArray) {
        assertEquals(8, numArray[0]);
        assertEquals(12, numArray[1]);
    }

    @org.junit.Test
    public void bubbleSort3ElementArray() throws Exception {
        int[] orderedArray = {5, 7, 19};
        mySorter.sort(orderedArray);
        assert3ElementOrder(orderedArray);

        int[] scrambledArray1 = {5, 19, 7};
        mySorter.sort(scrambledArray1);
        assert3ElementOrder(scrambledArray1);

        int[] scrambledArray2 = {7, 5, 19};
        mySorter.sort(scrambledArray2);
        assert3ElementOrder(scrambledArray2);

        int[] scrambledArray3 = {7, 19, 5};
        mySorter.sort(scrambledArray3);
        assert3ElementOrder(scrambledArray3);

        int[] scrambledArray4 = {19, 7, 5};
        mySorter.sort(scrambledArray4);
        assert3ElementOrder(scrambledArray4);

        int[] scrambledArray5 = {19, 5, 7};
        mySorter.sort(scrambledArray5);
        assert3ElementOrder(scrambledArray5);
    }

    private void assert3ElementOrder(int[] numArray) {
        assertEquals(5, numArray[0]);
        assertEquals(7, numArray[1]);
        assertEquals(19, numArray[2]);
    }

    @org.junit.Test
    public void bubbleSort4ElementArray() throws Exception {
        int[] orderedArray = {10, 18, 6, 3};
        mySorter.sort(orderedArray);
        assertEquals(3, orderedArray[0]);
        assertEquals(6, orderedArray[1]);
        assertEquals(10, orderedArray[2]);
        assertEquals(18, orderedArray[3]);
    }

    @org.junit.Test
    public void bubbleSort4ElementArray2() throws Exception {
        int[] orderedArray = {6, 4, 2, 10};
        mySorter.sort(orderedArray);
        assertEquals(2, orderedArray[0]);
        assertEquals(4, orderedArray[1]);
        assertEquals(6, orderedArray[2]);
        assertEquals(10, orderedArray[3]);
    }

    @org.junit.Test
    public void bubbleSortArrayWithDuplicates() throws Exception {
        int[] orderedArray = {10, 5, 9, 9};
        mySorter.sort(orderedArray);
        assertEquals(5, orderedArray[0]);
        assertEquals(9, orderedArray[1]);
        assertEquals(9, orderedArray[2]);
        assertEquals(10, orderedArray[3]);
    }

    @org.junit.Test
    public void getFactorialTest() throws Exception {
        assertEquals(2, myRunner.getFactorial(2));
        assertEquals(6, myRunner.getFactorial(3));
        assertEquals(120, myRunner.getFactorial(5));
        assertEquals(40320, myRunner.getFactorial(8));
    }

    @org.junit.Test
    public void getFibTest() throws Exception {
        assertEquals(0, myRunner.getFib(0));
        assertEquals(1, myRunner.getFib(1));
        assertEquals(1, myRunner.getFib(2));
        assertEquals(2, myRunner.getFib(3));
        assertEquals(3, myRunner.getFib(4));
        assertEquals(5, myRunner.getFib(5));
        assertEquals(8, myRunner.getFib(6));
        assertEquals(13, myRunner.getFib(7));
        assertEquals(55, myRunner.getFib(10));
    }


}