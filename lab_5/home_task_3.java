package labs.lab_5;
import java.util.Arrays;
public class home_task_3 {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 4, 3, 2, 10, 9, 6, 1};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Sorted Array: " + Arrays.toString(mergeSort(numbers)));
    }
    static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        int midIndex = array.length / 2;

        int[] leftHalf = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] rightHalf = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
        
        return merge(leftHalf, rightHalf);
    }
    static int[] merge(int[] leftHalf, int[] rightHalf) {
        int[] sortedArray = new int[leftHalf.length + rightHalf.length];
        int leftIndex = 0, rightIndex = 0, sortedIndex = 0;

        while (leftIndex < leftHalf.length && rightIndex < rightHalf.length) {
            if (leftHalf[leftIndex] < rightHalf[rightIndex]) {
                sortedArray[sortedIndex] = leftHalf[leftIndex];
                leftIndex++;
            } else {
                sortedArray[sortedIndex] = rightHalf[rightIndex];
                rightIndex++;
            }
            sortedIndex++;
        }
        while (leftIndex < leftHalf.length) {
            sortedArray[sortedIndex] = leftHalf[leftIndex];
            leftIndex++;
            sortedIndex++;
        }
        while (rightIndex < rightHalf.length) {
            sortedArray[sortedIndex] = rightHalf[rightIndex];
            rightIndex++;
            sortedIndex++;
        }
        return sortedArray;
    }
}
