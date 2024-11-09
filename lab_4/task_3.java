package labs.lab_4;
public class task_3 {
    public static void main(String[] args) {
        String[] arr = {"ABC", "DEF","GHI","GHI","DEF","ABC"} ;
        System.out.println("Array is palindrome: "+stringArrayPalindrome(arr));
       
    }
    static boolean stringArrayPalindrome(String[] arr){
        int start =0;
        int end = arr.length-1;

        while(start<end){
            if(!arr[start].equals(arr[end])){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}



