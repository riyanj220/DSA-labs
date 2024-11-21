import java.util.ArrayList;
public class lab_task_1 {
    public static void main(String[] args) {
        int[] arr = {100,30000,5000,50000,100000,40000,14000,13000,11000,10500};
        System.out.println("Account Number: "+ checkAccountBalance(arr)+" Has low balance");
    }

    static ArrayList<Integer> checkAccountBalance(int[] arr){
        ArrayList<Integer> accountNumber = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<10000){
                accountNumber.add(i);
            }
        }
        return accountNumber;
    }
}


