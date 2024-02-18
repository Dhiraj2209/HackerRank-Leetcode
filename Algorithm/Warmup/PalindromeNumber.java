class Solution {
        public boolean isPalindrome(int x) {
            String s = Integer.toString(x);

            boolean v = false;

            if(s.length() == 1){
                return true;
            }
            for(int i = 0 ; i < s.length() / 2; i++){
                if(s.charAt(i) == s.charAt(s.length() -1 - i)){
                    v = true;
                }
                else{
                    v = false;
                    break;
                }
            }
            return v;
        }
    }
