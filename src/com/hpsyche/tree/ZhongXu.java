package com.hpsyche.tree;

import com.hpsyche.utils.TreeNode;

import java.util.Stack;

/**
 * @author hpsyche
 * Create on 2020/3/8
 */
public class ZhongXu {
    public void Zhongxu(TreeNode root){
        if(root==null){
            return;
        }
        Zhongxu(root.left);
        System.out.println(root);
        Zhongxu(root.right);
    }

    public void ZhongXuRecursion(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }else{
                root=stack.pop();
                System.out.println(root.val);
                root=root.right;
            }
        }
    }
}
