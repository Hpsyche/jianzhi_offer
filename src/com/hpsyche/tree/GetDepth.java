package com.hpsyche.tree;

import com.hpsyche.utils.TreeNode;

import java.util.LinkedList;

/**
 * @author hpsyche
 * Create on 2020/3/8
 */
public class GetDepth {
    public int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(getDepth(root.left)+1,getDepth(root.right)+1);
    }

    public int getDepthNoRecursion(TreeNode root){
        LinkedList<TreeNode> list=new LinkedList<>();
        list.add(root);
        int level=0;
        while (!list.isEmpty()){
            level++;
            int curr=0;
            while (curr<list.size()){
                TreeNode temp = list.poll();
                curr++;
                if(temp.left!=null){
                    list.add(root.left);
                }
                if(temp.right!=null){
                    list.add(root.right);
                }
            }
        }
        return level;
    }

}
