public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();  
        int[] ret = new int[2];  
           
        for(int i=0; i<numbers.length; i++){  
            // 对每一个数边放边查找  
            if(ht.get(target-numbers[i]) != null){  
                ret[0] = ht.get(target-numbers[i]) + 1;  
                ret[1] = i+1;  
            }else{  
                ht.put(numbers[i], i);  
            }  
        }  
           
        return ret;    
    }
}  