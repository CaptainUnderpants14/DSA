package DSA.Arrays;

import java.util.Arrays;

//Assume smallest value at the start assign it as minimum(minIndex) and then compare it with the next element
//if it is greates than that then ressign minIndex to the next element
//and then shift those two values in the outer for loop this effectively result in one swap per iteration
//as compared to the many swaps of bubble sort in a single interation so it generally better than 
//bubble sort despite same TC of n^2.

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 7, 3, 9, 8};
        System.out.println("Before sorting : " + Arrays.toString(arr));
        int size = arr.length;
        int minIndex;
        int temp = 0;
        for (int i = 0; i < size - 1; i++){
            minIndex = i;
            for (int j = i + 1; j < size; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("After Sorting : "+ Arrays.toString(arr));
    }
}
