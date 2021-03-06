package com.company;

import java.util.Arrays;

public class BinarySearch {

    public int binarySearch(int [] array, int target){
        int low = 0;
        int high = array.length - 1;
        Arrays.sort(array);
        while( low <= high){
            int mid = (low + high) / 2;
            if(array[mid] > target) {
                high = mid + 1;
            }else if(array[mid] ==target) {
                return mid;
            }else{
                low = mid - 1;
            }

        }
        return -1;
    }
}
