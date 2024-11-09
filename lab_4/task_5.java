package labs.lab_4;
import java.util.*;
public class task_5 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,4,3};
        System.out.println(Arrays.toString(mergeAndRemoveDuplicate(arr1,arr2)));
    }
    static int[] mergeAndRemoveDuplicate(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();

        for(int num:arr1){
           set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for(int num:set){
            result[i++] =num;
        }

        return result;
    }
}


