package com.hpsyche.Jianzhi;

import com.hpsyche.utils.TreeNode;

import java.util.Arrays;

/**
 * @author hpsyche
 * Create on 2020/2/25
 * 重建二叉树
 */
public class ReConstructBinaryTree {
    /**
     * 前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
     * @param pre
     * @param in
     * @return
     */
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if(pre.length==0){
            return null;
        }
        int rootVal=pre[0];
        if(pre.length==1){
            return new TreeNode(rootVal);
        }
        TreeNode root=new TreeNode(rootVal);
        int rootIndex=-1;
        for(int i=0;i<in.length;i++){
            if(rootVal==in[i]){
                rootIndex=i;
                break;
            }
        }
        root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,rootIndex+1),
                Arrays.copyOfRange(in,0,rootIndex));
        root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),
                Arrays.copyOfRange(in,rootIndex+1,in.length));
        return root;
    }
}
