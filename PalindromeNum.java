public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){return false;}
        if(x<10){return true;}
        int div = 1;  
        while(x/div >=10)  
            div*=10;  
        while(x>0)  {  
            int l = x/div;  
            int r = x%10;  
            if(l!=r) return false;  
            x=x%div/10;  //x = (x % (10^n))/10 delete left, then delete right
            div/=100;  
        }  
        return true;  
    }
}