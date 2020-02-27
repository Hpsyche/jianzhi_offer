package com.hpsyche.Jianzhi;

import com.hpsyche.utils.TreeNode;

import java.util.Stack;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 二叉树第k小的节点
 */
public class KthNode {
    TreeNode KthNode(TreeNode root, int k) {
        if(root == null || k == 0) return null;
        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || ! stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            count ++;
            if(count == k) return root;
            root = root.right;
        }
        return null;
    }

}
