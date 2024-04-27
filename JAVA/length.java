/*You are given a list of words. Print each word along with its length.*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            String word = scanner.next();
            int length = word.length();
            System.out.println(word + " " + length);
        }
        
        scanner.close();
    }
}
