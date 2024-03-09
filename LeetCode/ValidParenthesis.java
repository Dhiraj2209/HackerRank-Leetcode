class Solution {
    public boolean isValid(String s) {
            Stack<Character> stk = new Stack<>();
            stk.push(s.charAt(0));

            for(int i  = 1 ; i < s.length() ; i++){
                if(stk.empty() && (s.charAt(i) == ']' || s.charAt(i) == ')' || s.charAt(i) == '}')){
                    return false;
                }
                else if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stk.push(s.charAt(i));
                }
                else{
                    if((s.charAt(i) == '}' && stk.peek() == '{') || (s.charAt(i) == ')' && stk.peek() == '(') || (s.charAt(i) == ']' && stk.peek() == '[')){
                        stk.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
    
            if(!stk.empty()){
                return false;
            }
            return true;
        }
}
