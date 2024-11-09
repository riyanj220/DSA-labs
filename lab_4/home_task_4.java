package labs.lab_4;
public class home_task_4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11};
        System.out.println("Number that is missing: "+numberMissing(arr));
    }

    static int numberMissing(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]-arr[i+1]!=-1){
                return arr[i]+1;
            }
        }
        return -1;
    }
}


