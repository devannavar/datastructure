package com.sorting;

import java.util.Arrays;
//4,3,5,2,3,1
//4,3,1,2,3,5
//3,3,1,2,4
//2,3,1,3
//2,1,3
//1,2
//1,2,3,3,4,5
public class BubbleSort {
    int[] sort(int array[]){
        for(int i=0;i< array.length;i++){
            for(int j=0; j< array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int []ranks = {4,3,5,2,3,1};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(ranks)));

    }
}
