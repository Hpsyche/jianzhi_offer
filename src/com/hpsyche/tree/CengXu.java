package com.hpsyche.tree;

import com.hpsyche.utils.TreeNode;

import java.util.LinkedList;

/**
 * @author hpsyche
 * Create on 2020/3/8
 */
public class CengXu {
    public void cengXu(TreeNode root){
        LinkedList<TreeNode> list=new LinkedList<>();
        list.offer(root);
        while (!list.isEmpty()){
            TreeNode temp=list.poll();
            System.out.println(temp.val);
            if(temp.left!=null){
                list.offer(temp.left);
            }
            if(temp.right!=null){
                list.offer(temp.right);
            }
        }
    }


}
