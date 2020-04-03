package com.hpsyche.mytree;

import com.hpsyche.utils.TreeNode;

import java.util.LinkedList;

/**
 * @author hpsyche
 * Create on 2020/3/8
 */
public class CengXu {
    public void cengXu(TreeNode root){
        LinkedList<TreeNode> list=new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()){
            TreeNode temp = list.poll();
            System.out.println(temp.val);
            if(temp.left!=null){
                list.add(temp.left);
            }
            if(temp.right!=null){
                list.add(temp.right);
            }
        }
    }
}
