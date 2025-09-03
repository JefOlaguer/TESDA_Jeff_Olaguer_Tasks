package chapter3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int length = input.length();
        boolean isPalindrome = true;

       for (int i = 0; i < length / 2; i++) {
            if (input.toLowerCase().charAt(i) != input.toLowerCase().charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
       }

