import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest extends BubbleSort {

    private BubbleSort bubbleSort = new BubbleSort();

    @org.junit.Test

    public void testSortEmpty() {
        int[] values = {};
        bubbleSort.sort(values);

    }
    @Test
    public void testSortedOneElement(){
         int[] value = {50};
         bubbleSort.sort(value);
    }
    @Test
    public void testSortedCorrect(){
        int[] values={9,8,7,6,5,4,3,2,1};
        int[] expect = {1,2,3,4,5,6,7,8,9};
        bubbleSort.sort(values);
        Assert.assertArrayEquals(expect,values);
    }
}