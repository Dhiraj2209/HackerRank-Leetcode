import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.

input two big integer and print sum and multiplication of that big Integers.  */
        Scanner sc = new Scanner(System.in);
        
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        
        BigInteger bnt1 = new BigInteger(num1);
        BigInteger bnt2 = new BigInteger(num2);
        
        BigInteger sum = bnt1.add(bnt2);
        System.out.println(sum);
        
        System.out.println(bnt1.multiply(bnt2));
    }
}
