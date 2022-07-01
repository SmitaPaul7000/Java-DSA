/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
*/

class Solution {
    private static HashMap<Character, Integer> map = new HashMap<>();
static{
    map.put('M', 1000);
    map.put('D', 500);
    map.put('C', 100);
    map.put('L', 50);
    map.put('X', 10);
    map.put('V', 5);
    map.put('I', 1);
}
public int romanToInt(String s) 
{
    int preVal = 0;
    int res = 0;
    
    for(int i = 0; i < s.length(); i++)
    {
        int currVal = map.get(s.charAt(i));
        
        System.out.println(s.charAt(i) + "  " + currVal);
        
        if(preVal < currVal)
        {
            res -= preVal * 2;
        }
        System.out.println(" reVal " + res);
        preVal = currVal;
        res += currVal;
        System.out.println(" pre Val " + preVal + " currVal " + currVal + " res " + res);
    }
    return res;
}
}

/*

"LVIII"

Debugger:
L  50
 reVal 0
 pre Val 50 currVal 50 res 50
V  5
 reVal 50
 pre Val 5 currVal 5 res 55
I  1
 reVal 55
 pre Val 1 currVal 1 res 56
I  1
 reVal 56
 pre Val 1 currVal 1 res 57
I  1
 reVal 57
 pre Val 1 currVal 1 res 58

Output
58
*/
