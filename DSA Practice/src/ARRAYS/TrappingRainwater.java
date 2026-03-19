package ARRAYS;

// Problem: Trapping Rain Water (42)
// Link: https://leetcode.com/problems/trapping-rain-water/
// Difficulty: Hard
// Time Complexity: O(n)
// Space Complexity: O(n)

public class TrappingRainwater {
    public int trap(int[] height) {
        int n=height.length;
        int rh[]=new  int[n];
        int lh[]=new int[n];
        lh[0]=height[0];
        int max=0,i;
        rh[n-1]=height[n-1];
        for(i=1;i<n;i++){
            lh[i]=Math.max(lh[i-1],height[i]);
        }
        for(i=n-2;i>=0;i--){
            rh[i]=Math.max(height[i],rh[i+1]);
        }
        for(i=0;i<n;i++){
            max+=Math.min(lh[i],rh[i])-height[i];
        }
        return max;
    }
}



/*
imagine every index as a potential water-trapping position
water trapped at any index = min(maxHeight from left, maxHeight from right) - height[index]
precompute left max array (lh) and right max array (rh) in two separate passes
then in the final pass subtract height[i] from min(lh[i], rh[i]) and accumulate
*/