/*
   Problem: Reverse a Number

   Question:
   Write a program to reverse the digits of a given number.

   Explanation:
   - Input:  1234
   - Output: 4321

   Trickiness:
   - You need to extract digits one by one using modulus (%) operator
   - Then build the reversed number by multiplying old result by 10 and adding last digit
*/

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;

        // Step 2: Extract digits until number becomes 0
        while (num != 0) {
            int digit = num % 10;          // Get last digit
            reversed = reversed * 10 + digit;  // Add digit in reverse order
            num = num / 10;                // Remove last digit
        }

        // Step 3: Print reversed number
        System.out.println("Reversed number is: " + reversed);

        sc.close();
    }
}

/*
   Steps to Solve:
   1. Take input number.
   2. Initialize reversed = 0.
   3. Loop while num != 0:
        - digit = num % 10
        - reversed = reversed * 10 + digit
        - num = num / 10
   4. Print reversed.
*/
