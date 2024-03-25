class Solution {
    public int lengthOfLastWord(String s) {
        int c = 0;
        if(s.length() == 1){
            return 1;
        }
        for(int i = s.length() - 1; i >= 0 ;i--){
           if(s.charAt(i) == ' '){
                if(c > 0) {
                    return c;
                }
            }
            else {
                c++;
            }
        }
        return c;
    }
}
