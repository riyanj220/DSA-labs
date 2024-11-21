import java.util.Arrays;
public class lab_task_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,90,98,97,95,43};
        int target = 6;
        System.out.println(search(arr ,target));
    }

    static int search(int[] arr ,int target){
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, target);
        if(index!=-1){
            return index;
        }
        return index;
    }
}

