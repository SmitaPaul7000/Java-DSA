

class Solution {
    public boolean wordPattern(String pattern, String s) {
      
        String[] arr = s.split(" ");
        
	    if(arr.length != pattern.length())    return false;
		
        HashMap<String,Character>hmp = new HashMap<>();
        
        for(int i=0; i<arr.length; i++)
        {
            String str = arr[i];
            Character ch = pattern.charAt(i);
            
			
            if(hmp.containsKey(str) && hmp.get(str)!=ch)
                return false;
				
			if(hmp.containsValue(ch) && hmp.get(str)!=ch)
                return false;
            
            hmp.put(arr[i], pattern.charAt(i));
            
            System.out.println(hmp);
           
        }
    return true;
    }
    
    }
/*
1)-------------
Your input
"abba"
"dog cat cat dog"
stdout
{dog=a}
{cat=b, dog=a}
{cat=b, dog=a}
{cat=b, dog=a}

Output
true

2)----------
Your input
"abba"
"dog cat cat fish"

Debugger 
{dog=a}
{cat=b, dog=a}
{cat=b, dog=a}

Output
false
*/
