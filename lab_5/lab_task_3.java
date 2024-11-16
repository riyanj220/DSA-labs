package labs.lab_5;
import java.util.Arrays;
public class lab_task_3 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 3, 2, 10, 9, 6, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sorted Array: " + Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        System.out.println("Dividing: " + Arrays.toString(arr) +
                " into " + Arrays.toString(Arrays.copyOfRange(arr, 0, mid)) +
                " and " + Arrays.toString(Arrays.copyOfRange(arr, mid, arr.length)));

        int[] firstArr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] secondArr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(firstArr, secondArr);
    }

    static int[] merge(int[] firstArr, int[] secondArr) {
        int[] mix = new int[firstArr.length + secondArr.length];

        int i = 0, j = 0, k = 0;

        System.out.println("Merging: " + Arrays.toString(firstArr) + " and " + Arrays.toString(secondArr));

        while (i < firstArr.length && j < secondArr.length) {
            if (firstArr[i] < secondArr[j]) {
                mix[k] = firstArr[i];
                i++;
            } else {
                mix[k] = secondArr[j];
                j++;
            }
            k++;
        }

        while (i < firstArr.length) {
            mix[k] = firstArr[i];
            i++; k++;
            
        }

        while (j < secondArr.length) {
            mix[k] = secondArr[j];
            j++; k++;
            
        }

        System.out.println("Result after merging: " + Arrays.toString(mix));
        return mix;
    }
}
