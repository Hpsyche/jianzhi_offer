package com.hpsyche.tree;

import com.hpsyche.utils.TreeNode;

import java.util.Stack;

/**
 * @author hpsyche
 * Create on 2020/3/8
 */
public class QianXu {
    public void QianXu(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root);
        QianXu(root.left);
        QianXu(root.right);
    }

    public void QianXuNoRecursion(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode res=stack.pop();
            System.out.println(res.val);
            if(res.right!=null){
                stack.add(res.right);
            }
            if(res.left!=null){
                stack.add(res.left);
            }
        }
    }
}
