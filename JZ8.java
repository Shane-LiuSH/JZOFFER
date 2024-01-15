import java.util.*;

/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    ArrayList<TreeLinkNode> nodes = new ArrayList<>();
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode root = pNode;
        while (root.next != null) {
            root = root.next;
        }
        inorder(root);
        int n = nodes.size();
        for (int i = 0; i < n; i++) {
            TreeLinkNode cur = nodes.get(i);
            if (pNode == cur) {
                return nodes.get(i + 1);
            }
        }
        return null;
    }
    public void inorder(TreeLinkNode root){
        if (root != null) {
            inorder(root.left);
            nodes.add(root);
            inorder(root.right);
        }        
    }
}
