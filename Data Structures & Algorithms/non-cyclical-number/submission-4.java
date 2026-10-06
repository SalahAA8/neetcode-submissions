class Solution {
    public boolean isHappy(int n) {
    
        HashSet<Integer> set = new HashSet<Integer>();
        while (n != 1){
            int output = 0;
            String str = String.valueOf(n);
            int[] digits = new int[str.length()];
            if(set.contains(n)){
                return false;
            }

            set.add(n);
            for(int i = 0; i<str.length(); i++){
                digits[i] = str.charAt(i) - '0';
            }
            for(int num: digits){
                output += (num*num);
            }
            n = output;

        }
        return true;

    }
}
