import java.util.*;
public class home_task_3 {
    public static void main(String[] args) {
        double[] balances = {1500.0, 500.0, 250.0, 50.0, 1000.0, 120.0, 800.0};
        double threshold = 200.0; 

        List<Integer> lowBalanceAccounts = identifyLowBalances(balances, threshold);

        if (!lowBalanceAccounts.isEmpty()) {
            System.out.println("Alert! The following accounts have critically low balances:");
            for (int account : lowBalanceAccounts) {
                System.out.println("Account #" + account + " with balance: $" + balances[account]);
            }
        } else {
            System.out.println("All accounts are above the critical balance threshold.");
        }
    }

    public static List<Integer> identifyLowBalances(double[] balances, double threshold) {
        List<Integer> lowBalanceAccounts = new ArrayList<>();

        for (int i = 0; i < balances.length; i++) {
            if (balances[i] < threshold) {
                lowBalanceAccounts.add(i); 
            }
        }
        return lowBalanceAccounts;
    }
}


