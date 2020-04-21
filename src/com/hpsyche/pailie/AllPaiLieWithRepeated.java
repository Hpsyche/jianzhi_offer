package com.hpsyche.pailie;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hpsyche
 * Create on 2020/4/21
 */
public class AllPaiLieWithRepeated {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> allPaiLie(int[] nums){
        helper(nums,0,nums.length-1);
        return res;
    }

    private void helper(int[] nums, int start, int end) {
        if(start==end){
            List<Integer> list= new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            res.add(list);
            return;
        }
        List<Integer> list=new LinkedList<>();
        for(int i=start;i<=end;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                swap(nums,i,start);
                helper(nums,start+1,end);
                swap(nums,i,start);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    @Test
    public void test1(){
        List<List<Integer>> lists = allPaiLie(new int[]{1,2,2,3});
        for(List<Integer> list:lists){
            for(int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
