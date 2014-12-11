public class TwoSum {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        if(numbers == null || numbers.length<2){
        	return null;
        }
        int[] index = new int[2];
        for(int i = 0; i < numbers.length; i++){
        	for(int j = i; j < numbers.length; j++){
        		if(numbers[i]+numbers[j] == target){
        			index[0] = i+1;
        			index[1] = j+1;
        			return index;
        		}
        	}
        }
        return index;
    }

    public static void main(String[] args) {
    	TwoSum sol = new TwoSum();
    	int[] num = {1,2,3,4,5,6,7};
    	int[] ind = sol.twoSum(num,11);
    	for (int i = 0; i<ind.length; i++) {
    		System.out.println(ind[i]);
    	}
    }
}
// wait for better solution
