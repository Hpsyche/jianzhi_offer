package com.hpsyche.Jianzhi;

import com.hpsyche.utils.TreeNode;

/**
 * @author hpsyche
 * Create on 2020/2/26
 */
public class Mirror {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
