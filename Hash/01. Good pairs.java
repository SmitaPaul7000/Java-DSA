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
        
        int pairs = 0;
        
        for(int num:map.values())
        {
            int count = (num * (num-1)/2);
            pairs+=count;
        }
 
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
