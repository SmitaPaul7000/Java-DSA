// Given an array of integers nums, return the number of good pairs.
class Solution {
    public int numIdenticalPairs(int[] nums) {        
        
        HashMap<Integer,Integer> map = new HashMap<>(); 
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);
            else 
                map.put(nums[i],1);
        }
        
        // for [1,2,3,1,1,3] HM will be = e.g {1=3, 2=1, 3=1}
        
        int pairs = 0;
        
        // for[1,2,3,1,1,3]  map.values() = 3 1 1 2
        for(int num:map.values())
        {
            int count = (num * (num-1)/2);
            pairs+=count;
        }
        /*
        3 1 1 2
        3 * (3-1) / 2 = 3* 2/2 = 3
        1 * (1-1) / 2 = 1* 0/2 = 0
        1 * (1-1) / 2 = 1* 0/2 = 0
        2 * (2-1) / 2 = 2* 1/2 = 1
        3+1 =4
        pair are 
        1 1, 1 1, 1 1, 3 3 == 4 pairs
        */
 
        return pairs;
        
}
}
/*
Your input
[1,2,3,1,1,3]
[1,1,1,1]
[1,2,3]

Output
4
6
0
*/
