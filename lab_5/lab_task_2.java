package labs.lab_5;
import java.util.Arrays;
public class lab_task_2 {
    public static void main(String[] args) {
        int[] arr = {5,7,4,3,2,10,9,6,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j = 0 ; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("In "+i+ " iteration "+Arrays.toString(arr));
        }
    }
}


