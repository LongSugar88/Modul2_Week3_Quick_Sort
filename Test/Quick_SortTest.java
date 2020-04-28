import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quick_SortTest {
    Quick_Sort myQuickSort = new Quick_Sort();
    @BeforeEach
    void setup(){
        myQuickSort = new Quick_Sort();
    }

    @Test
    void sort() {
        int[] myArray = {5,7,4,5,2,9,0,1,3};
        int[] expect = {0,1,2,3,4,5,5,7,9};
        int[] result = myQuickSort.quickSort(myArray, 0 , myArray.length-1);
        System.out.println();
        Assert.assertArrayEquals(expect, result);
    }
    @Test
    void sort1() {
        int[] myArray = {7,9,6,4,0,8,2,3,5,1};
        int[] expect = {0,1,2,3,4,5,6,7,8,9};
        int[] result = myQuickSort.quickSort(myArray, 0 , myArray.length-1);
        Assert.assertArrayEquals(expect, result);
    }
    @Test
    void sort2() {
        int[] myArray1 = {2,0,4,6,8,7,3,1,5};
        int[] expect = {0,1,2,3,4,5,6,7,8};
        int[] result = myQuickSort.quickSort(myArray1, 0 , myArray1.length-1);
        Assert.assertArrayEquals(expect, result);
    }
}