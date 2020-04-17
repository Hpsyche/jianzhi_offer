package com.hpsyche.binary;

import org.junit.Test;

/**
 * @author hpsyche
 * Create on 2020/4/17
 */
public class Solution {
    public int getTargetIndex(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        while (l<=r){
            int mid=l+((r-l)>>1);
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }

    public int getTargetLeftIndex(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        while (l<=r){
            int mid=l+((r-l)>>1);
            if(nums[mid]==target){
                r=mid-1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(l<nums.length&&nums[l]!=target){
            return -1;
        }
        return l;
    }

    public int getTargetRightIndex(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        while (l<=r){
            int mid=l+((r-l)>>1);
            if(nums[mid]==target){
                l=mid+1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(r>=0&&nums[r]!=target){
            return -1;
        }
        return r;
    }


    @Test
    public void test1(){
        System.out.println(getTargetIndex(new int[]{1,2,3,3,3,3,3,6,8},3));
        System.out.println(getTargetLeftIndex(new int[]{1,2,3,3,3,3,3,6,8},3));
        System.out.println(getTargetRightIndex(new int[]{1,2,3,3,3,3,3,6,8},3));
    }
}
