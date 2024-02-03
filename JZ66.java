import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param A int整型一维数组
     * @return int整型一维数组
     */
    public int[] multiply(int[] A) {
        // write code here
        int n = A.length;
        int[] B = new int[n];
        int product = 1;
        for(int i = 0; i < n; product *= A[i], i++){
            B[i] = product;
        }
        product = 1;
        for(int i = n -1; i >= 0; product *= A[i], i--){
            B[i] *= product;
        }
        return B;
    }
}