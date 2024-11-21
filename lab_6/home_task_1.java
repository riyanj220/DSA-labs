import java.util.Arrays;
public class home_task_1 {
    public static void main(String[] args) {
        int[][] arr  ={
            {20,30,35,40},
            {45,47,49,50},
            {53,54,59,60},
            {62,80,85,90}
        };
        int target = 62;
        System.out.println(Arrays.toString(searchIn2D(arr,target)));
    }
    
    static int[] searchIn2D(int[][] arr ,int target){
        int row = 0;
        int column = arr.length-1;

        while(row < arr.length && column>=0){
            if(arr[row][column] == target){
                return new int[]{row,column};
            }

            else if(arr[row][column] <target){
                row++;
            }
            else if(arr[row][column] > target){
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
