class Soi {
	public int atoi(String str) {
        if (str == null || str.length() < 1)
		    return 0;
		// trim white spaces
	    str = str.trim();
	    
        int i = 0;
        double result = 0;  //use double to save, in case the reslut is too large?
        if (str.charAt(0) == '-'){
            i++;
        }
        if (str.charAt(0) == '+'){
            i++;
        }
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
		        result = result * 10 + (str.charAt(i) - '0');
		        i++;
	    }
        if (str.charAt(0) == '-'){
            result = result * -1;
            if(result < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
	    if(result > Integer.MAX_VALUE){
	        return Integer.MAX_VALUE;
	    }
	    System.out.println("i: " + i);
        return (int)result;
    }
    public static void main(String[] args) {
    		Soi test = new Soi();
    		int out = test.atoi("+1");
    		System.out.println(out);
    }	
}