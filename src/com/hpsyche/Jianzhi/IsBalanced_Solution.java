package com.hpsyche.Jianzhi;

import com.hpsyche.utils.TreeNode;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 是否平衡二叉树
 */
public class IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        int leftHeight=TreeDepth(root.left);
        int rightHeight=TreeDepth(root.right);
        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }
        return IsBalanced_Solution(root.left)&& IsBalanced_Solution(root.right);
    }

    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(TreeDepth(root.left)+1,TreeDepth(root.right)+1);
    }
}
