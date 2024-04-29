import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        // Check if the lengths of the strings are equal
        if (a.length() != b.length()) {
            return false;
        }

        // Convert both strings to lowercase for case-insensitive comparison
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] freq = new int[26];

        // Update frequency counts for string a
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                freq[index]++;
            }
        }

        // Update frequency counts for string b
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                freq[index]--;
            }
        }

        // Check if all frequency counts are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
