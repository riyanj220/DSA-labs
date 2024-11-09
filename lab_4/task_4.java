package labs.lab_4;
public class task_4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,20,30,40,43,74};
        System.out.println(countNumOfEvenOddDigits(arr1));
    }

    static String countNumOfEvenOddDigits(int[] arr){
        int even = 0,odd = 0;
        for(int i = 0;i<arr.length;i++){
            if(i%2==-0){
                even++;
            }
            else{
                odd++;
            }
        }
        return "Even Digits are: "+even+"\nOdd Digits are: "+odd;
    }
}


