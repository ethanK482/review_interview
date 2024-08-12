package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main( String[] args )
    {
       int[] arr = new int[]{5, 4, 3, 2, 1};
       int n = arr.length;
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n-i-1; j++){
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j]= arr[j+1];
        //             arr[j+1]= temp;
        //         }
        //     }
        // }



        // for(int i = 0; i< n-1; i++){
        //     int minIndex = i;
        //     for(int j = i + 1; j < n; j++){
        //         if(arr[minIndex] > arr[j]){
        //             minIndex = j;
        //         }

        //     }
        //     int temp = arr[minIndex];
        //     arr[minIndex] =  arr[i];
        //     arr[i] = temp;

        // }

        
        // for(int i = 1; i < n; i++){
        //     int key = arr[i];
        //     int j = i-1;
        //     while(j >=0 && arr[j] > key){
        //         arr[j+1] =arr[j];
        //         j--;
        //     }
        //     arr[j+1] = key;
                
        // }

            System.out.print(" sort: ");
            System.out.println(Arrays.toString(arr));

    }
}