package com.hpsyche.mytree;

import com.hpsyche.utils.TreeNode;
import org.junit.Test;

import java.util.List;
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
        while(!stack.isEmpty()||root!=null){
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

    @Test
    public void test1(){
        TreeNode treeNode=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        treeNode.right=treeNode2;
        treeNode2.left=treeNode3;
        zhongXu(treeNode);
    }
}
