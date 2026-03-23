package DSA.Arrays;

public class SearchingInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 3;
        System.out.println("The target is at the index : "+ binarySearch(arr, target));
    }

    public static int linearSearch(int[] nums, int target){
        for (int i = 0; i<nums.length; i++){
            if (nums[i] == target){
                System.out.println("The index is : "+ i);
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target){
        //2, 3, 4, ,5 ,6 , 7, 8
        int s = 0;
        int e = nums.length -1;
        
        while (s < e){
            int mid = (s + e)/2;
            if (nums[mid] == target){
                return mid;
            }
            else if (mid < target){
                s = mid + 1;
            }
            else if(mid > target){
                e = mid - 1;
            }
        }
        return -1;
    }
}
