// https://leetcode.com/problems/maximum-subarray/description/
// Given an integer array nums, find the 
// subarray
// with the largest sum, and return its sum.

 
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=nums[0];
       //kadane's algorithm
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxi)
            {
                maxi=sum;
            }
            if(sum<0)
            {
                sum=0;
            }

        }
        //if(maxi<0) maxi=0;
        return maxi;
    }
}
