import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param num int整型一维数组 
     * @param size int整型 
     * @return int整型ArrayList
     */
    public ArrayList<Integer> maxInWindows (int[] num, int size) {
        // write code here
        
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> (b-a));
        ArrayList<Integer> res = new ArrayList<>();
        if (size > num.length || size < 1){
            return res;
        }
        for(int i = 0; i < size; i++){
            heap.add(num[i]);
        }
        res.add(heap.peek());
        for(int i = 0, j = size; j < num.length; i++, j++){
            heap.remove(num[i]);
            heap.add(num[j]);
            res.add(heap.peek());
        }
        return res;
    }
}