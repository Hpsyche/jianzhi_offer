package com.hpsyche.Jianzhi;

import com.hpsyche.utils.TreeNode;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 是否对称二叉树
 */
public class isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot==null){
            return true;
        }
        return isSymmetrical(pRoot.left,pRoot.right);

    }

    private boolean isSymmetrical(TreeNode left, TreeNode right) {
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        return left.val==right.val&&isSymmetrical(left.left,right.right)&&isSymmetrical(left.right,right.left);
    }
}
