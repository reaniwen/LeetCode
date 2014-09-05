public class SingleNumber {
    public int singleNumber(int[] A) {
        if (A == null){
            return 0;
        }
        if(A.length == 1){
            return A[0];
        }
        int rpt = 0;
        for(int num: A){
            rpt = rpt ^ num;
        }
        return rpt;
    }

    public static void main(String[] args) {
        int a = this.singleNumber({1,1,2,2,3,3,4,4,5,5,6});
        System.out.println(a);
    }
}