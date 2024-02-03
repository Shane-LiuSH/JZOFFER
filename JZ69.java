import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param number int整型
     * @return int整型
     */
    public int jumpFloor(int number) {
        // write code here
        int[] res = new int[number];
        if(number <= 2){
            return number;
        }
        res[0] = 1;
        res[1] = 2;
        for(int i = 2; i < number; i++){
            res[i] = res[i-1] + res[i-2];
        }
        return res[number-1];
    }
}