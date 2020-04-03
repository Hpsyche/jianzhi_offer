package com.hpsyche.tree;

import com.hpsyche.utils.TreeNode;

import java.util.Stack;

/**
 * @author hpsyche
 * Create on 2020/3/8
 */
public class HouXu {
    public void HouXu(TreeNode root){
        if(root==null){
            return;
        }
        HouXu(root.left);
        HouXu(root.right);
        System.out.println(root);
    }

    public void HouXuRecursion(TreeNode root){
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            root=s1.pop();
            s2.push(root);
            if(root.left!=null){
                s1.push(root.left);
            }
            if(root.right!=null){
                s1.push(root.right);
            }
        }
        while (!s2.isEmpty()){
            System.out.println(s2.pop().val);
        }
    }

}
