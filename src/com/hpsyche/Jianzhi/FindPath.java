package com.hpsyche.Jianzhi;

import com.hpsyche.utils.TreeNode;

import java.util.ArrayList;

/**
 * @author hpsyche
 * 二叉树所有的路径
 * Create on 2020/2/27
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        find(res,new ArrayList<Integer>(),root,target);
        return res;
    }

    private void find(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> path, TreeNode root, int target) {
        path.add(root.val);
        if(root.left==null&&root.right==null){
            if(target==root.val){
                res.add(path);
            }
            return;
        }
        ArrayList<Integer> path2=new ArrayList<>();
        //path2操作右分支，避免相互影响
        path2.addAll(path);
        if(root.left!=null){
            find(res,path,root.left,target-root.val);
        }
        if(root.right!=null){
            find(res,path2,root.right,target-root.val);
        }
    }

}
