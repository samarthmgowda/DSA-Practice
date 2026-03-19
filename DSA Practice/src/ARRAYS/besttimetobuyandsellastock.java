package ARRAYS;

// Problem: Best time to buy and sell a Stock(121)
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

public class besttimetobuyandsellastock {
    public int maxProfit(int[] prices) {
        int bestbuy=prices[0],mp=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>bestbuy){
                mp=Math.max(mp,prices[i]-bestbuy);
            }
            bestbuy=Math.min(bestbuy,prices[i]);
        }
        return mp;
    }
}


/*
imagine every day as a selling day and calculate max profit that can be achived on that day
by considering the best buy from the previous days
and on each iteration try to update maxprofit and bestbuy
 */