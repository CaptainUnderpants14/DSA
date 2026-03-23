package DSA.Arrays;

import java.util.Arrays;

//Compare adjacent values and try to shift the bigger value to the end
//Time complexity is n^2

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 7, 3, 9, 8};
        System.out.println("Before sorting : " + Arrays.toString(arr));
        int size = arr.length;
        int temp = 0;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size -i- 1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting : "+ Arrays.toString(arr));
    }
}
