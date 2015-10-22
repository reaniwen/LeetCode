public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        if( s.length() != t.length() || s == null || t == null){
			return false;
		}
		s = s.toLowerCase();
		t = t.toLowerCase();
		int len = s.length();
		int[] store = new int[256];
//		for (int i = 0; i < 256; i++) {
//			store[i] = 0;
//		}		
		for (int i = 0; i < len; i++) {
			++store[s.charAt(i)-97];
			--store[t.charAt(i)-97];
		}
		for (int i = 0; i< len; i++) {
			if (store[(int)s.charAt(i)-97] != 0) {
				return false;
			}
		}
		return true;
    }

    public boolean compareStrings(String A, String B) {
        // write your code here
        int[] store = new int[256];
        for(int i = 0; i < A.length(); i++) {
            store[A.charAt(i)-65]++;
        }   
        for(int i = 0; i < B.length(); i++) {
            if (store[B.charAt(i)-65] <= 0) {
                return false;
            }
            store[B.charAt(i)-65]--;
        }
        return true;
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		if(s.compareStrings("","AB")){
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}
};
