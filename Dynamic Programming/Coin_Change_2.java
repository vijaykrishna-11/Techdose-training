package Dynamic Programming;

public class Coin_Change_2 {
    public int change(int amount, int[] coins) {
        int dp[] = new int[amount+1];
         int i,j;
         int c = coins.length;
         dp[0] = 1;
         for(i=0;i<c;i++){
             for(j=coins[i] ; j<=amount ; j++){
                 dp[j] += dp[j - coins[i]];
             }
         }
         
         return dp[amount]; 
     }
}
