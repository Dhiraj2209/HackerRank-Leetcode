import java.math.BigInteger;
/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits*/
class Solution {
    public int[] plusOne(int[] digits) {
        // StringBuilder s1 = new StringBuilder();
        String s1 = "";
        
        // for (int digit : digits) {
        //     s1.append(digit);
        // }

        for(int i = 0 ; i < digits.length ;i++){
            s1 += Integer.toString(digits[i]); // adding every int to build final string
        }
        
        BigInteger bi1 = new BigInteger(s1.toString()); // convert String to Big int for arbitry large values.(can store any number based on memory.)
        bi1 = bi1.add(BigInteger.ONE); //Increment value by one
        
        String s2 = bi1.toString(); // converting final int to string for stroing in array
        
        int[] finalarr;
        if (s2.length() > s1.length()) {
            finalarr = new int[(digits.length + 1)]; 
        } else {
            finalarr = new int[(digits.length)];
        }
        
        for (int i = 0; i < s2.length(); i++) {
            finalarr[i] = Character.getNumericValue(s2.charAt(i)); //get ith character and add into array at ith index.
        }
        return finalarr; // return answer
    }
}
