/*Given a double-precision number, payment, denoting an amount
of money, use the NumberFormat class' getCurrencylnstance
method to convert payment into the US, Indian, Chinese, and
French currency formats. Then print the formatted values as follows:
US: formattedPayment
India: formattedPayment
Chi na: formattedPayment
France: formattedPayment*/

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        String usa = us.format(payment); 
        
        Locale ind = new Locale("en", "IN"); //India don't Have inbluit Locale
        
        NumberFormat in = NumberFormat.getCurrencyInstance(ind);
        String india = in.format(payment);
        
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = ch.format(payment); 
        
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = fr.format(payment);
           
        System.out.println("US: " + usa);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
