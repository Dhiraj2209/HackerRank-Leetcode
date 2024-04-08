import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    /*
    You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
    */

    public static String findDay(int month, int day, int year) {
        int da = 0;
        if((year % 400 == 0 && month == 2 && day == 29)|| (year % 4 == 0 && year % 100 != 0 && month == 2 && day == 29)){ // leap year and date is 29 Feb 
                Date d = new Date((year-1900), (month -1),day - 1);
                da = (d.getDay() + 1);
                if(da == 8){
                    da = 1;
                } 
        }else {
            Date d = new Date((year-1900), (month -1),day);
            da = d.getDay();
        }
        switch(da){
            case 1 : return "MONDAY";
            case 2 : return "TUESDAY";
            case 3 : return "WEDNESDAY";
            case 4 : return "THURSDAY";
            case 5 : return "FRIDAY";
            case 6 : return "SATURDAY";
            case 7 : return "SUNDAY";
        }

        return "";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
