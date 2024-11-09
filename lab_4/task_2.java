package labs.lab_4;

import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        System.out.println("After merging:: "+Arrays.toString(mergeElementsInArray(arr1,arr2)));
    }

    static int[] mergeElementsInArray(int[] arr1, int[] arr2){
        int[] mergedArr = new int[arr1.length+arr2.length];

        for(int i = 0; i<arr1.length;i++){
            mergedArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArr[arr1.length+i] = arr2[i];
        }

        return mergedArr;
    }
}
