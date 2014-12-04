public class Solution {
    public int romanToInt(String s) {
        if(s.length() == 0){
            return 0;
        }
        int result = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)== 'I'){
                result +=1;
            }
            boolean notFirst = true;
            if(i == 0){
                notFirst = false;
            }
            if(s.charAt(i)== 'V'){
                if(notFirst && s.charAt(i-1) == 'I'){
                    result += 4;
                    i--;
                }else{ result += 5;}
            }
            if(s.charAt(i)== 'X'){
                if(notFirst && s.charAt(i-1) == 'I'){
                    result += 9;
                    i--;
                }else{ result += 10;}
            }
            if(s.charAt(i) == 'L'){
                if(notFirst && s.charAt(i-1) == 'X'){
                    result += 40;
                    i--;
                }else{result += 50;}
            }
            if(s.charAt(i) == 'C'){
                if(notFirst && s.charAt(i-1) == 'X'){
                    result += 90;
                    i--;
                }else{result += 100;}
            }
            if(s.charAt(i) == 'D'){
                if(notFirst && s.charAt(i-1) == 'C'){
                    result += 400;
                    i--;
                }else{result += 500;}
            }
            if(s.charAt(i) == 'M'){
                if(notFirst && s.charAt(i-1) == 'C'){
                    result += 900;
                    i--;
                }else{result += 1000;}
            }
            // System.out.println("result so far is "+ result);
        }
        return result;
    }
}