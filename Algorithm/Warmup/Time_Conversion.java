import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    char AorP = s.charAt(8);
    int Hour = Integer.parseInt(s.substring(0, 2));
    
    if(AorP == 'P' && Hour == 12){
        //String mid12 = "12";
        return "12" + s.substring(2, 8);
    }
    else if(AorP == 'P'){
         Hour += 12 ;
         String changedHour = Integer.toString(Hour);
         return changedHour + s.substring(2, 8);
    }
    else if(AorP == 'A' && Hour == 12){
        //String mid12 = "00";
        return "00" + s.substring(2, 8);
    }
    else {
        return s.substring(0, 8);
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
