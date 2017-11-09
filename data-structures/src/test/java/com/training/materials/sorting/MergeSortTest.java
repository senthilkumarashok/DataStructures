package com.training.materials.sorting;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class MergeSortTest {

  private Iterable<Integer[]> inputs;

  public MergeSortTest() {
        Integer[][] input = {  {1, 2, 4, 3} , {1} , {-1, 3, -2, 5, -6}, {0, 2, 3, -100}, {}, {2, 3, 2, 4, 5, 4, -98}, {} };
        this.inputs = Arrays.asList(input);
  }

  @Test
  public void test() {
    for(Integer[] input: inputs) {
      input = MergeSort.mergeSort(input);
      assertTrue(isSorted(input));
    }
  }

  private boolean isSorted(Comparable[] nums) {
    System.out.println("isSorted :: "+Arrays.toString(nums));
    int length = nums.length;
    if (length <= 1)
        return true;
    for(int i = 1; i < length; i++) {
      if(nums[i-1].compareTo(nums[i]) > 0) {
        return false;
      }
    }
    return true;
  }
}
