package com.training.materials.sorting;

import java.util.Arrays;

public class QuickSort {

  public static void sort(Integer[] nums) {

    quicksort(nums, 0, nums.length-1);
    //System.out.println(" pivot :: "+pivot);
    //sort(nums, low, pivot-1);
    //sort(nums, pivot+1, nums.length-1);
  }

  private static void quicksort(Integer[] nums, int start, int end) {

    if(end - start + 1 <= 1) return;

    int pivot = end;
    int low = start;
    int high = end-1;

    while(low <= high) {
      // 6, 5, 4, 2, 1, 10, 3, 7, 8, 9
      while(low <= high && nums[low] <= nums[pivot]) {
        low++;
      }

      while(high >= low && nums[high] > nums[pivot]) {
        high--;
      }

      if(low < high) {
        swap(nums, low, high);
      }
      //System.out.println("nums :: "+ Arrays.toString(nums));
    }
    //System.out.println("low ::" + low + " h ::" + h);
    if(pivot != low) {
      swap(nums, pivot, low);
    }
      quicksort(nums, start, low-1);
      quicksort(nums, low+1, end);
    
    //partition(nums, 0, h-1);
    //partition(nums, h+1, high);
    //return low;
  }

  private static void swap(Integer[] nums, int i , int j) {
    int temp = nums[j];
    nums[j] = nums[i];
    nums[i] = temp;
  }
}
