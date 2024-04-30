public class Solution {

    public static String compressString(String s) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;

            // If next character is different or end of string
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 0; // Reset count for next character
            }
        }

        // Check if compressed string is shorter than original string
        return compressed.length() < s.length() ? compressed.toString() : s;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"aabcccccaaa", "abcdef", "aaabbbccc"};
        for (String testCase : testCases) {
            System.out.println("Original: " + testCase);
            System.out.println("Compressed: " + compressString(testCase));
            System.out.println();
        }
    }
}
