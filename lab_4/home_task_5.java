package labs.lab_4;
import java.util.*;
public class home_task_5 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,9,34,25,67,31};
        zigzagArray(arr);
        System.out.println("After sorting zigzag: "+Arrays.toString(arr));
    }
    static void zigzagArray(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

