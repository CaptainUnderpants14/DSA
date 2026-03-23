package DSA.Arrays;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 6, 1 , 8, 0};
        System.out.println("Array before sorting: " + Arrays.toString(arr));

        // Outer loop: treat arr[0..i-1] as the "sorted" portion and grow it one element at a time
        for(int i = 0; i < arr.length; i++){
        // Pick the next unsorted element to insert into the sorted portion
        int key = arr[i];
        // Start comparing from the rightmost element of the sorted portion
        int j = i -1;
        // Shift every sorted element that is greater than key one position to the right,
        // opening up a gap for key to be inserted
        while (j>= 0 && arr[j] > key){
            arr[j+1] = arr[j]; // shift element right
            j--;               // move left to check the next sorted element
        }
        // Place key into the gap — j+1 is either the start of the array or just after
        // the last element that was not greater than key
        arr[j+1] = key;
        }  
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
      
}
