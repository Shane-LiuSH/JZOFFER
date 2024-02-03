import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param index int整型
     * @return int整型
     */
    public int GetUglyNumber_Solution(int index) {
        // write code here
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        if(index <= 6){
            return index;
        }
        int[] res = new int[index];
        int[] dp = new int[index];
        dp[0] = 1;
        for (int i = 1; i < index; i++) {
            int next2 = dp[i2] * 2, next3 = dp[i3] * 3, next5 = dp[i5] * 5;
            dp[i] = Math.min(next2, Math.min(next3, next5));
            if (dp[i] == next2)
                i2++;
            if (dp[i] == next3)
                i3++;
            if (dp[i] == next5)
                i5++;
        }
        return dp[index-1];
    }
}