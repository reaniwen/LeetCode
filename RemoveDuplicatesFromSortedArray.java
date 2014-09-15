public class Solution {
    public int removeDuplicates(int[] A) {
        if(A == null || A.length == 0){
            return 0;
        }
        
        int size = 0;
        int dup = A[0];
        for(int i = 1; i< A.length; i++){
            if (A[i] != A[size]) {
                A[++size] = A[i];
            }
        }
        return size + 1;
    }
}