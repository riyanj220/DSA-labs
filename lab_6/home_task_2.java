import java.util.HashSet;
public class home_task_2 {
    public static void main(String[] args) {
        int[] arr = {12,34,53,567,4,2,4,5,1,86,75,43,4,53};
        int[] occur = occurences(arr);
        HashSet<Integer> printed = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!printed.contains(arr[i])) {
                System.out.print(arr[i] + " : " + occur[i] + " ; ");
                printed.add(arr[i]); 
            }
        }
    }

    static int[] occurences(int[] arr){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            int key = arr[i];
            int count = 0;
            for(int j =0;j<arr.length;j++){
                if (arr[j] == key){
                    count++;
                }
            }
            temp[i] = count;
        }
        return temp;
    }
}


