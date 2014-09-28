public class Solution {
    public void sortColors(int[] A) {
        int one = 0;
        int two = 0;
        int three = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                one++;
            }
            else if(A[i] == 1){
                two++;
            }
            else if(A[i] == 2){
                three++;
            }
        }
        for(int i = 0; i < one; i++){
            A[i] = 0;
        }
        for(int i = one; i < one + two; i++){
            A[i] = 1;
        }
        for(int i = one + two; i < A.length; i++){
            A[i] = 2;
        }
    }
}