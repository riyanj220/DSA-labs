public class lab_task_4 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,50,60,90,30,100};
        int target = 30;
        System.out.println(firstOccurence(arr,target));
    }

    static int firstOccurence(int[] arr ,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int m = start+(end-start)/2;
            
            if(target >arr[m]){
                start = m+1;
            }
            else if(target<arr[m]){
                end = m-1;
            }
            else{
                return m;
            }
        }
        return -1;
    }
}

