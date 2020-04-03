package com.hpsyche.tree;

import com.hpsyche.utils.TreeNode;

import java.util.LinkedList;

/**
 * @author hpsyche
 * Create on 2020/3/8
 */
public class GetWidth {
    public int getWidth(TreeNode root){
        int maxDepth=0;
        LinkedList<TreeNode> list=new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()){
            int curr=0;
            while (curr<list.size()){
                curr++;
                TreeNode temp=list.poll();
                if(temp.left!=null){
                    list.add(temp.left);
                }
                if(temp.right!=null){
                    list.add(temp.right);
                }
            }
            if(curr>maxDepth){
                maxDepth=curr;
            }
        }
        return maxDepth;
    }
}
