package com.hpsyche.Jianzhi;

import com.hpsyche.utils.TreeNode;

import java.util.ArrayList;

/**
 * @author hpsyche
 * Create on 2020/2/26
 * 层次遍历
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        if (root == null) {
            return res;
        }
        ArrayList<TreeNode> queue=new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.remove(0);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null) {
                queue.add(temp.right);
            }
            res.add(temp.val);
        }
        return res;
    }
}
