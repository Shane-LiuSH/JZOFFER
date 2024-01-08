import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param pushV int整型一维数组 
     * @param popV int整型一维数组 
     * @return bool布尔型
     */
    public boolean IsPopOrder (int[] pushV, int[] popV) {
        Stack<Integer> stack = new Stack<>();
        int pushIndex = 0;
        int popIndex = 0;
        for(pushIndex = 0; pushIndex < pushV.length; pushIndex++) {
            stack.push(pushV[pushIndex]);
            while(!stack.isEmpty() && popIndex < popV.length && stack.peek() == popV[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}