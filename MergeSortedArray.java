public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int index = m + n;
        while (m > 0 && n > 0) {
            A[--index] = (A[m-1] > B[n-1])?A[--m]:B[--n];
            // if (A[m - 1] > B[n - 1]) {
            //     A[--index] = A[--m];
            // } else {
            //     A[--index] = B[--n];
            // }
        }
        //this part is brilliant
        while (n > 0) {
            A[--index] = B[--n];
        }
    }
}