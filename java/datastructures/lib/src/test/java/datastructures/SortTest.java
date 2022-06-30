package datastructures;

import datastructures.sort.Sort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortTest {

  @Test
  void sortReturnsCorrectArray() {
    int[] array = new int[] {8,4,23,42,16,15};
    Sort sut = new Sort();
    int[] array1 = new int[] {4,8,15,16,23,42};
    assertEquals(array1[5],sut.insertionSort(array)[5]);
  }

  @Test
  void mergeSortSortsArray() {
    int[] array = new int[] {8,4,23,42,16,15};
    Sort sut = new Sort();
    int[] array1 = new int[] {4,8,15,16,23,42};
    sut.mergeSort(array);
    assertEquals(array1[1], array[1]);
    assertEquals(array1[2], array[2]);
    assertEquals(array1[3], array[3]);
    assertEquals(array1[4], array[4]);
    assertEquals(array1[5], array[5]);
  }
}
