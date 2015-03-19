public class Solution {
    public int trap(int[] A) {
        if(A == null){
            return 0;
        }
        if(A.length <= 2){
            return 0;
        }
        // from left to right, for the recent point, find left max value
        int length = A.length;
        int[] leftMax = new int[length];
        int[] rightMax = new int[length];
        int leftMx = 0;
        int rightMx = 0;
        for(int i = 0; i < length; i++){
            if(A[i] > leftMx){
                leftMax[i] = A[i];
                leftMx = A[i];
            }else{
                leftMax[i] = leftMx;
            }
        }

        //from right to left, for the recent point, find right max point
        for(int i = length-1; i >= 0; i--){
            if(A[i] > rightMx){
                rightMx = A[i];
            }
            rightMax[i] = rightMx;
        }
        
        //from left to right, for the recent point, find the 
        int sum = 0;
        for(int i = 0; i < length; i++){
            sum += (Math.min(leftMax[i], rightMax[i])-A[i]);
            System.out.print("i: "+ i +" leftMax: " + leftMax[i]+ " rightMax: " + rightMax[i]);
            System.out.println(" sum:" + sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] input = {2,0,2};
        int sum = sol.trap(input);
        System.out.println(sum);
    }
}