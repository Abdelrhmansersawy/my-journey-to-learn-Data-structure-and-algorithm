package com.company;
import java.util.*;
public class binarySearch {
    // to use binary search need that arra be sorted
    public static int  rank(int key,int []arr){
        int st = 0,end = arr.length -1;
        // arr[st....end]
        while (st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] > key) end = mid-1;
            else if(arr[mid] < key) st = mid + 1;
            else return mid;
        }
        return -1;
    }
}
