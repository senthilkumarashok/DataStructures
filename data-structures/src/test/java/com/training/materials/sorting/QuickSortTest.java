package com.training.materials.sorting;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class QuickSortTest {

  private Iterable<Integer[]> inputs;

  public QuickSortTest() {
        Integer[][] input = { {} , {1}, {2, 1}, {1, 0, -1}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {-5, -4 ,-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
         {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5},
         {1, 1, 2, 2, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 8, 8},
         {6, 20, 17, 0, 32, -7, 45, 4}};
        //Integer[][] input = { {1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 6, 7} };
        this.inputs = Arrays.asList(input);
  }

  @Test
  public void test() {
    for(Integer[] input: inputs) {
      QuickSort.sort(input);
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
