package com.hpsyche.tree;

import com.hpsyche.utils.TreeNode;

/**
 * @author hpsyche
 * Create on 2020/3/8
 */
public class GetMirror {
    public void getMirror(TreeNode root){
        if(root==null){
            return ;
        }
        if(root.left==null&&root.right==null){
            return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        getMirror(root.left);
        getMirror(root.right);
    }
}
