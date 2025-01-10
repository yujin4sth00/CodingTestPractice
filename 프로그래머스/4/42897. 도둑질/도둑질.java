import java.util.*;

class Solution {
    public int solution(int[] money) {
        
        int[] dp = new int[money.length];
        int[] dp2 = new int[money.length];
        
        // 1번째 집 털어버리기
        dp[0] = money[0];
        dp[1] = Math.max(money[0], money[1]);
        
        for(int i = 2; i < money.length; i++) {
            dp[i] = Math.max(dp[i - 2] + money[i], dp[i - 1]);
        }
        
        // 1번째 집 봐주기 대신 마지막 집 털어버리기
        dp2[0] = 0;
        dp2[1] = money[1];
        
        for(int i = 2; i < money.length; i++) {
            dp2[i] = Math.max(dp2[i - 2] + money[i], dp2[i - 1]);
        }
        
        return Math.max(dp[money.length - 2], dp2[money.length - 1]);
    }
}