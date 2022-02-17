package com.sorting;

import java.util.Arrays;

//4,3,5,2,3,1
//4 : 3,1,2,3,5
//3,4 : 1,2,3,5
//3,4 : 1,2,3,5
   //3,1,4 : 2,3,5
   //1,3,4 : 2,3,5
//1,3,2,4 :3,5
  //1,2,3,4 :3,5
//1,2,3,3,4: ,5
//1,2,3,3,4,5
public class InsertionSort {
    int[] sort(int array[]){
        for(int i=1;i< array.length;i++){
            for(int j=i; j>0;j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int []ranks = {4,3,5,2,3,1};
        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.sort(ranks)));

    }
}
