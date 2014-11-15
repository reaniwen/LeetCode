public class Solution {
    public int reverse(int x) {
        boolean neg = false;
        int result = 0;
        if(x<0){
            neg = true;
            x *= -1;
        }
        
        while(x>0){
            result = result*10 + x % 10;
            x /= 10;
        }
        if(neg){
          result *= -1; 
        }
        return result;
    }
}