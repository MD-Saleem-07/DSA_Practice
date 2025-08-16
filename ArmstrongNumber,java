/*
 Question:
 ---------
 Check whether a given number is an Armstrong number or not.

 Explanation:
 ------------
 An Armstrong number (also called a narcissistic number) is a number that is 
 equal to the sum of its digits each raised to the power of the number of digits.

 Example:
 --------
   153 = 1³ + 5³ + 3³ = 153   (Armstrong)
   123 = 1³ + 2³ + 3³ = 36    (Not Armstrong)

 Steps to Solve:
 ---------------
 1. Take the input number.
 2. Count the number of digits in the number.
 3. Extract each digit using % 10.
 4. Raise each digit to the power of the number of digits and add it to a sum.
 5. Compare the sum with the original number.
    - If equal → Armstrong number
    - Else → Not Armstrong
*/

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        // Step 2: Count number of digits
        int digits = String.valueOf(num).length();

        // Step 3 & 4: Extract digits and compute sum of powers
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        // Step 5: Compare with original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
