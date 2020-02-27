package com.hpsyche.Jianzhi;

import com.hpsyche.utils.TreeNode;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 输深度
 */
public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(TreeDepth(root.left)+1,TreeDepth(root.right)+1);
    }
}
