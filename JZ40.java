import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param input int整型一维数组 
     * @param k int整型 
     * @return int整型ArrayList
     */
    public void swap(int[] nums, int left, int right){
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
    public int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int i = left;
        int j = right;
        
        while (i < j) {
            while (i < j && nums[j] >= pivot) {
                j--;
            }
            while (i < j && nums[i] <= pivot) {
                i++;
            }
            if (i < j) {
                swap(nums, i, j);
            }
        }
        swap(nums, left, i);
        return i;
    }


    public void findsmallest(int[] nums, int k){
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int pivot = partition(nums, left, right);
            if(pivot == k ){
                return;
            }
            if(pivot < k ){
                left = pivot + 1;
            }
            else{
                right = pivot - 1;
            }
        }
    }
    public ArrayList<Integer> GetLeastNumbers_Solution (int[] input, int k) {
        // write code here
        ArrayList<Integer> res = new ArrayList<>();
        if (k > input.length || k <= 0){
            return res;
        }
        findsmallest(input, k);
        for(int i = 0; i < k; i++){
            res.add(input[i]);
        }
        return res;
    }
}