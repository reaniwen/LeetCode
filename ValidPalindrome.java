public class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s == null){return true;}
        s = s.trim();
        s = s.toLowerCase();
        int srt = 0;
        int end = s.length()-1;
        while(srt < end){
            if(!isAlpNum(s.charAt(srt))){srt++;continue;}
            if(!isAlpNum(s.charAt(end))){end--;continue;}
            if(s.charAt(srt) != s.charAt(end)){
                return false;
            }
            
            srt++;
            end--;
        }
        return true;
    }
    public boolean isAlpNum(char c){
            if(c>='a' && c<='z') return true;
            if(c>='0' && c<='9') return true;
            return false;
    }
}