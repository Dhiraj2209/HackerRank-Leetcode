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

    /* Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    Integer ar[] = {0,0,0,0,0};
    
    for(int i = 0 ; i < arr.size(); i++){
        if(arr.get(i) == 1){
            ar[0]++;
        }
        else if(arr.get(i) == 2){
            ar[1]++;
        }
        else if(arr.get(i) == 3){
            ar[2]++;
        }
        else if(arr.get(i) == 4){
            ar[3]++;
        }
        else {
            ar[4]++;
        }
    }
    
    int max = Collections.max(Arrays.asList(ar));
    Integer br[] = new Integer[5];
    
    for(int i = 0 ; i < ar.length;i++){
        if(ar[i] == max){
            br[i] = i + 1;
        }
    }
    
    int min = 0;
    for(int i = 0 ; i < br.length ;i++){
        if(br[i] != null){
            min = br[i];
            break;
        }
    }
    return min;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
