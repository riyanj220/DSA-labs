package labs.lab_5;
import java.util.Arrays;
public class home_task_2 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 3, 2, 10, 9, 6, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sorted Array: " + Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[]arr){
        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;

        int[] arr1 = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] arr2 = mergeSort(Arrays.copyOfRange(arr, mid,arr.length));
        
        return merge(arr1,arr2);
    }
    static int[] merge(int[] arr1, int[] arr2){
        int[] finalMergedArray = new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                finalMergedArray[k] = arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j]){
                finalMergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            finalMergedArray[k] = arr1[i];
            i++; k++;
        }
        while (j < arr2.length) {
            finalMergedArray[k] = arr2[j];
            j++; k++;
        }
        return finalMergedArray;
    }
}
