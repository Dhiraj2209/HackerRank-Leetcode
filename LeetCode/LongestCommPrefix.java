class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder();
        String first = strs[0];

        if (strs.length == 1 && strs[0].length() == 1) {
            return strs[0];
        }
        
        for (int k = 0; k < strs.length - 1; k++) {
            if (strs[k + 1].isEmpty()) {
                return ""; // If any string is empty, return empty string
            }
            for (int i = 0; i < first.length() ; i++) {
                if (i == strs[k + 1].length() || first.charAt(i) != strs[k + 1].charAt(i)) { // If both characters don't match or if the index is out of bounds
                s.delete(i, first.length());
                break; // Break the loop
                }
                if (k == 0) {
                    s.append(first.charAt(i));
                }
            }
            first = s.toString(); 
        }
        // return s.toString();
        return first;
    }
}
