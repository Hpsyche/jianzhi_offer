package com.hpsyche.Jianzhi;

import com.hpsyche.utils.TreeLinkNode;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 中序遍历的下一个节点是
 *
 * 1、有右子树的，那么下个结点就是右子树最左边的点；（eg：D，B，E，A，C，G）
 * 2、没有右子树的，也可以分成两类，
 *  a)是父节点左孩子（eg：N，I，L） ，那么父节点就是下一个节点 ；
 *  b)是父节点的右孩子（eg：H，J，K，M）找他的父节点的父节点的父节点...
 * 直到当前结点是其父节点的左孩子位置。如果没有eg：M，那么他就是尾节点。
 */
public class GetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode==null){
            return null;
        }
        if(pNode.right!=null){
            pNode=pNode.right;
            while (pNode.left!=null){
                pNode=pNode.left;
            }
            return pNode;
        }
        while (pNode.next!=null){
            TreeLinkNode pRoot=pNode.next;
            if(pRoot.left==pNode){
                return pRoot;
            }
            pNode=pNode.next;
        }
        return null;
    }
}
