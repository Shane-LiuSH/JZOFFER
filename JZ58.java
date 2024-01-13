import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param str string字符串 
     * @param n int整型 
     * @return string字符串
     */
    public String LeftRotateString (String str, int n) {
        // write code here
        if(str.isEmpty() || str.length() == 0)
            return "";
        char[] chars = str.toCharArray();
        n = n % str.length();
        reverse(chars, 0, n - 1);
        reverse(chars, n, chars.length - 1);
        reverse(chars, 0, chars.length - 1);
        return new String(chars);
    }
    public void reverse(char[] chars, int i, int j){
        while (i <= j) {
            swap(chars, i++, j--);
        }
    }
    public void swap(char[] chars, int i, int j){
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}