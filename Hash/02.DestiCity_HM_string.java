/* you are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
*/
 
 class Solution {
    public String destCity(List<List<String>> paths) {
      
        Map<String, Boolean> map = new HashMap<>();
        for (List<String> ss : paths) {
            map.put(ss.get(0), false);
            System.out.println(map);
            if (!map.containsKey(ss.get(1))) {
                map.put(ss.get(1), true);
            }
            System.out.println(" ****  " + map);
        }
        System.out.println("==========" +map);
        
        for (String s : map.keySet()) {
            if (map.get(s)) return s;
        }
        return null;
        
    }
}

/*
[["B","C"],["D","B"],["C","A"]]


{B=false}
 ****  {B=false, C=true}
{B=false, C=true, D=false}
 ****  {B=false, C=true, D=false}
{B=false, C=false, D=false}
 ****  {A=true, B=false, C=false, D=false}
=========={A=true, B=false, C=false, D=false}

Output: A

*/
