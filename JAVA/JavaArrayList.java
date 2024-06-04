import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .*/
      
      Scanner sc = new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        //creating arraylist of arraylist
        int n =  sc.nextInt();
        
        for(int i = 0 ; i < n ; i++){
            ArrayList<Integer> line = new ArrayList<>();
            //For every Line there is a new Line in which the d spaced integers are stored.
            int d = sc.nextInt();
                for(int j = 0 ; j < d ;j++){
                    line.add(sc.nextInt()); // Add Input element to the xth line and yth position on the xth line
                }
        
            ls.add(line); // Add xth line in main List.
        }
        
        sc.nextLine(); //New line Character
        
        int q =sc.nextInt(); //Number of Queries
        
        for(int i = 0 ; i < q ; i++){
            int x = sc.nextInt() - 1;// Doing -1 for zero based indexing.
            int y = sc.nextInt() - 1;
            
            if (x < ls.size() && y < ls.get(x).size()) { //if Size exceeds then Error!
                System.out.println(ls.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        sc.close();
    }
}
