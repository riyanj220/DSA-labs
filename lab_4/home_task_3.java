package labs.lab_4;
import java.util.*;
public class home_task_3 {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 5};
        int target = 14;
        System.out.println("Unique combinations that sum to " + target + ": " + findUniqueCombinations(arr, target));
    }

    static List<List<Integer>> findUniqueCombinations(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); 
        findCombinations(arr, target, 0, new ArrayList<>(), result);
        return result;
    }

    static void findCombinations(int[] arr, int target, int index, List<Integer> combination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(combination)); 
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) continue; 
            if (arr[i] > target) break;

            combination.add(arr[i]);
            findCombinations(arr, target - arr[i], i + 1, combination, result);
            combination.remove(combination.size() - 1); 
        }
    }
}
