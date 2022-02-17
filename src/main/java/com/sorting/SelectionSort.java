package com.sorting;

import java.util.Arrays;

//4,3,5,2,3,1
//1,3,5,2,3,4
//1,2,5,3,3,4
//1,2,3,5,3,4
//1,2,3,3,5,4
//1,2,3,3,4,5
public class SelectionSort {
    int[] sort(int array[]){
        for(int i=0;i< array.length;i++){
             int  min_idx=i;
            for(int j=i+1; j< array.length;j++){
                if(array[j] < array[min_idx]){
                    min_idx = j;
                }
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int []ranks = {4,3,5,2,3,1};
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.sort(ranks)));

    }
}
