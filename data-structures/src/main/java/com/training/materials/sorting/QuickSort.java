package com.training.materials.sorting;

Class QuickSort {

  public void quicksort(int[] nums, int low, int high) {

    int pivot = partition(nums, 0, nums.length);
    quicksort(nums, 0, pivot-1);
    quicksort(nums, pivot+1, nums.length);
  }

  private int partition(int[] nums, int low, int high) {
    int pivot = nums[low];
    int l = low;
    int h = high;
    while(l < h) {
      // 6, 5, 4, 2, 1, 10, 3, 7, 8, 9
      while(nums[l] <= pivot && l < h) {
        l++;
      }
      while(nums[h] > pivot) {
        h--;
      }
      swap(nums, l, h);
    }
    swap(nums, low, h);
  }

  private void swap(int[] nums, int i , int j) {
    int temp = nums[j];
    nums[j] = nums[i];
    nums[i] = temp;
  }
}
