public class Solution {
    public int searchInsert(int[] A, int target) {
        if(A.length == 0){
            return 0;
        }
        if(A.length == 1){
            if(target > A[0]){
                return 1;
            }else return 0;
        }
        int start = 0;
        int end = A.length - 1;
        while(start + 1 != end){
            int mid = start+ (end - start)/2;
            if(target == A[mid]){
                return mid;
            }
            if(target > A[mid]){
                start = mid;
            }
            if(target < A[mid]){
                end = mid;
            }
        }
        if(target <= A[start]){
            return start;
        }
        if(target <= A[end]){
            return end;
        }
        else{
            return end+1;
        }
    }
}