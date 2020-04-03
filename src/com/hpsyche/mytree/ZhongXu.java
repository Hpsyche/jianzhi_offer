package com.hpsyche.mytree;

import com.hpsyche.utils.TreeNode;

import java.util.Stack;

/**
 * @author hpsyche
 * Create on 2020/3/8
 */
public class ZhongXu {
    public void zhongXu(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            if (root!=null){
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
