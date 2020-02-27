package com.hpsyche.Jianzhi;

import com.hpsyche.utils.TreeNode;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 二叉搜索树变双向链表
 */
public class Convert {
    private TreeNode head=null;
    private TreeNode curr=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode curr=null;
        ConvertSub(pRootOfTree);
        return head;
    }

    private void ConvertSub(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return;
        }
        ConvertSub(pRootOfTree.left);
        if(head==null){
            head=pRootOfTree;
            curr=pRootOfTree;
        }else{
            curr.right=pRootOfTree;
            pRootOfTree.left=curr;
            curr=pRootOfTree;
        }
        ConvertSub(pRootOfTree.right);
    }
}
