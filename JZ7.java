import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param preOrder int整型一维数组
     * @param vinOrder int整型一维数组
     * @return TreeNode类
     */
    Map<Integer, Integer>map =new HashMap<>();
    public TreeNode reConstructBinaryTree(int[] preOrder, int[] vinOrder) {
        // write code here
        for(int i = 0; i < vinOrder.length; i++){
            map.put(vinOrder[i], i);
        }
        return reConstructBinaryTree(preOrder, 0, preOrder.length - 1, 0);
    }

    public TreeNode reConstructBinaryTree(int[] preOrder, int preL, int preR, int inL){
        if (preL > preR){
            return null;
        }
        TreeNode root = new TreeNode(preOrder[preL]);
        //index of root in inorder
        int indexR = map.get(root.val);
        int leftTreeSize = indexR - inL;
        root.left = reConstructBinaryTree(preOrder, preL + 1, preL + leftTreeSize, inL);
        root.right = reConstructBinaryTree(preOrder, preL + leftTreeSize + 1, preR, indexR + 1);
        return root;
    }
}