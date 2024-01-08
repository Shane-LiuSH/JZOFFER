import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param target int整型 
     * @param array int整型二维数组 
     * @return bool布尔型
     */
    public boolean Find (int target, int[][] array) {
        // write code here
        int x = 0;
        int y = array[0].length - 1;
        while (x <= array.length - 1 && y >= 0) {
            if(array[x][y] == target){
                return true;
            }
            if(array[x][y] < target){
                x++;
            }
            else{
                y--;
            }
        }
        return false;
    }
}