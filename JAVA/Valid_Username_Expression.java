import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:

The username consists of  to  characters inclusive. If the username consists of less than  or greater than  characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .*/
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        String us[] = new String[n];
        for(int i = 0; i < n; i++){
        us[i] = sc.nextLine();
        }
        
        for(int i = 0 ; i < n ; i++){
            if(us[i].length() < 8 || us[i].length() > 32 || 
            !((us[i].charAt(0) >= 65 && us[i].charAt(0) <= 90 )||
            (us[i].charAt(0) >= 97 && us[i].charAt(0) <= 122))){
                System.out.println("Invalid");
            }
            else {
                boolean isValid = true;
                for(int k = 0 ; k < us[i].length() ; k++){
                    if(us[i].charAt(k) != 95 && !(us[i].charAt(k) >= 65 && us[i].charAt(k) <= 90) && 
                    !(us[i].charAt(k) >= 97 && us[i].charAt(k) <= 122) && 
                    !(us[i].charAt(k) >= 48 && us[i].charAt(k) <= 57)){
                        System.out.println("Invalid");
                        isValid = false;
                        break;
                    }
                }
                if(isValid) {
                    System.out.println("Valid");
                }
            }
        }
    }
}
