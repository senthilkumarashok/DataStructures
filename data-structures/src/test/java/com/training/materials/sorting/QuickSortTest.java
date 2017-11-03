package com.training.materials.sorting;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class QuickSortTest {

  private Iterable<Integer[]> inputs;

  public QuickSortTest() {
        Integer[][] input = {  {1, 2, 4, 3} , {5, 4, 3} , {1, 2, 2, 4}};
        this.inputs = Arrays.asList(input);
  }

  public void test() {
    for(Integer[] input: inputs) {
      QuickSort.sort(input, 0, input.length-1);
      assertTrue(isSorted(input));
    }
  }

  private boolean isSorted(Comparable[] nums) {
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
