package labs.lab_4;
import java.util.Arrays;
public class home_task_1 {
    public static void main(String[] args) {
        int[] arr1 = {8,9,10,20,30,43,74};
        System.out.println(sumAndMeanOfAllElements(arr1));
        int key = 30;
        System.out.println("Splitted Array from that key index: \n"+splitArrayFromKeyIndex(arr1,key));
    }

    static String sumAndMeanOfAllElements(int[] arr1){
        int sum = 0;
        for(int i:arr1){
            sum+=i;
        }
        int mean  = sum/arr1.length;

        return "Sum is: "+sum+"\nMean is: "+mean;
    }

    static String splitArrayFromKeyIndex(int[] arr1,int key){
        int index =-1;
        for(int i=0;i<arr1.length;i++){
            if (arr1[i] == key){
                index = i;
                break;
            }
        }
        if(index==-1){
            return "-1";
        }
        int[] firstArr = Arrays.copyOfRange(arr1, 0, index+1);
        int[] secondArr = Arrays.copyOfRange(arr1, index+1, arr1.length);
        return "FIrst Array: "+Arrays.toString(firstArr)+"\nSecond Array: "+Arrays.toString(secondArr);
    }
}
