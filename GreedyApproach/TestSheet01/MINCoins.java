import java.util.Arrays;

class MINCoins {
    public int MinimumCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int amount = 7;
        MINCoins sol = new MINCoins();
        int result = sol.MinimumCoins(coins, amount);
        System.out.println("The minimum number of coins required to form the target sum is " + result);
    }
}