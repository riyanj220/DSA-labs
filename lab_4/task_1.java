package labs.lab_4;

import java.util.Arrays;

public class task_1 {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        swapElementsInArray(arr1,arr2);
        System.out.println("After swapping:\nArray 1: "+Arrays.toString(arr1)+"\nArray 2: "+Arrays.toString(arr2));
    }

    static void swapElementsInArray(int[] arr1, int[] arr2){
        for(int i = 0;i<arr1.length;i++){
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
    }
    
}

