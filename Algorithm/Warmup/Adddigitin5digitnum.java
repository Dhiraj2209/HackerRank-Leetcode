import java.util.Scanner;

public class Adddigitin5digitnum {

    public static void main(String[] args) {
        /* If a five-digit number is input through the keyboard, write a program to print a new number by adding one to each of its digits. For example, if the number that is input is 12391 then the output should be displayed as 23502.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int i = 0;
        int arr[] = new int[5];
        while(num >0 ){
            num = num +1;
            arr[i] = num % 10;
            num = num / 10;
            i++;
        }

        for(int j = 4 ; j  >= 0 ;j--){
            System.out.print(arr[j]);
        }
    }
}
