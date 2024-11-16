package labs.lab_5;
import java.util.Arrays;
public class lab_task_1 {
    public static void main(String[] args) {
        int[] arr = {5,7,4,3,2,10,9,6,1};
        selectionSort(arr);      
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = maxNumber(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int maxNumber(int[] arr, int start, int end){
        int max = start; 

        for (int i = start; i <= end; i++) { 
            if (arr[i] > arr[max]) { 
                max = i; 
            }
        }
        return max;
    }
}

