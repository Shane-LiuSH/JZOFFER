import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param str string字符串 
     * @return int整型
     */
    public int FirstNotRepeatingChar (String str) {
        // write code here
        int[] array = new int[128];
        for(int i = 0; i < str.length(); i++){
            array[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++){
            if (array[str.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }
}