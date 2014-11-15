public class Solution {
    public int removeDuplicates(int[] A) {
      if (A == null || A.length == 0) {
          return 0;
      }  
      
      int size = 0;
      boolean isRepeat = false;
      for (int i = 1; i < A.length; i++) {
          if (A[i] != A[size]){
              isRepeat = false;
              A[++size] = A[i];
          } else {
              if (isRepeat == false) {
                  isRepeat = true;
                  A[++size] = A[i];
              }
          }
      }
      return size + 1;
    }
}