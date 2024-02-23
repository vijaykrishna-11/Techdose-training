package Dynamic Programming;

public class Coin_Change {
    public int search(int[]coins,int amount,int[] dp)
    {
        if(amount==0) return 0;
        if(amount<0) return 10000000;
        if(dp[amount]!=-1) return dp[amount];
        int min=10000000;
        int ans=0;
        for(int i=0;i<coins.length;i++)
        {
            ans=1+search(coins,amount-coins[i], dp);
            min=Math.min(ans,min);
        }
        return dp[amount]=min;
    }
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-1);
        int a=search(coins,amount,dp);
        return a==10000000?-1:a;
    }
}
