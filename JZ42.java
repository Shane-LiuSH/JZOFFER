import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param array int整型一维数组
     * @return int整型
     */
    public int FindGreatestSumOfSubArray(int[] array) {
        // write code here
        if(array.length == 1){
            return array[0];
        }
        int sum = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        for(int val : array){
            sum = sum < 0 ? val: sum + val;
            res = Math.max(sum, res);
        }
        return res;
    }
}