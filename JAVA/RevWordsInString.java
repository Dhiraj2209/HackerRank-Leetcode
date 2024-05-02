public class Solution {

    public static String reverseWords(String s) {
        // Split the input string by one or more spaces
        String[] words = s.trim().split("\\s+");

        StringBuilder reversed = new StringBuilder();
      
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add a space between words
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"the sky is blue", "hello world", "  hello   world  "};
        for (String testCase : testCases) {
            System.out.println("Original: \"" + testCase + "\"");
            System.out.println("Reversed: \"" + reverseWords(testCase) + "\"");
            System.out.println();
        }
    }
}
