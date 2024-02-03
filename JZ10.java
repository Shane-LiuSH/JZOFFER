import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param n int整型
     * @return int整型
     */
    public int Fibonacci(int n) {
        // write code here
        int[] res = new int[n];
        if( n==1 || n == 2){
            return 1;
        }
        res[0] = 1;
        res[1] = 1;
        for(int i = 2; i < n; i++){
            res[i] = res[i-1] + res[i -2];
        }
        return res[n-1];
    }
}