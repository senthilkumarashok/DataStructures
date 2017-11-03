package com.training.materials.sorting;

import java.util.Arrays;
import java.lang.Integer;

public class MergeSort {

  public static Integer[] mergeSort(Integer[] nums) {
    int length = nums.length;
    if(length == 1) return nums;
    int middle = length/2;
    Integer[] L = split(nums, 0 , middle-1);
    Integer[] R = split(nums, middle, length-1);
    L = mergeSort(L);
    R = mergeSort(R);
    return merge(L, R);
  }

  public static Integer[] split(Integer[] nums, int startIndex, int endIndex) {
    //System.out.println("Inside split method with startIndex " + startIndex + " endIndex " + endIndex);
    Integer[] result = new Integer[endIndex - startIndex + 1];
    for(int i = 0; i < result.length; i++) {
      result[i] = nums[startIndex++];
    }
    //System.out.println("Return split method with result : "+ Arrays.toString(result));
    return result;
  }

  public static Integer[] merge(Integer[] A, Integer[] B) {
    //System.out.println("started merging for array A" + Arrays.toString(A) + " for array B" + Arrays.toString(B));
    Integer[] D = new Integer[A.length + B.length];
    int a = 0;
    int b = 0;
    int d = 0;
    while(a < A.length && b < B.length) {
      if(A[a] <= B[b]) {
        D[d++] = A[a++];
      } else {
        D[d++] = B[b++];
      }
    }
    while(a < A.length) {
      D[d++] = A[a++];
    }
    while(b < B.length) {
      D[d++] = B[b++];
    }
    //System.out.println("return merging for array A & array B " + Arrays.toString(D));
    return D;
  }

}
