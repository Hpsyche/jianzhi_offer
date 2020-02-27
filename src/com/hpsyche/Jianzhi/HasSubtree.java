package com.hpsyche.Jianzhi;

import com.hpsyche.utils.TreeNode;

/**
 * @author hpsyche
 * Create on 2020/2/26
 * 是否有子结构s
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null){
            return false;
        }
        return doesTree1HasTree2(root1, root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }

    private boolean doesTree1HasTree2(TreeNode root1, TreeNode root2) {
        if(root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        return root1.val==root2.val&&doesTree1HasTree2(root1.left,root2.left)&&doesTree1HasTree2(root1.right,root2.right);
    }
}
