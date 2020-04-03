package com.hpsyche.mytree;

import com.hpsyche.utils.TreeNode;

import java.util.Stack;

/**
 * @author hpsyche
 * Create on 2020/3/8
 */
public class HouXu {
    public void houXu(TreeNode root){
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()){
            TreeNode temp = s1.pop();
            s2.push(temp);
            if(temp.left!=null){
                s1.push(temp.left);
            }
            if(temp.right!=null){
                s1.push(temp.right);
            }
        }
        while (!s2.isEmpty()){
            System.out.println(s2.pop().val);
        }
    }
}
