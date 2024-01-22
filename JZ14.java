import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param n int整型
     * @return int整型
     */
    public int cutRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for(int i = 2 ; i < n ; i++){
            for(int j = 1; j < i; j++){
                dp[i] = Math.max(dp[i], dp[j] * (i - j));
            }
        }
        return dp[n - 1];
    }
}