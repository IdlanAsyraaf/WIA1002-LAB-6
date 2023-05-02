package pkg2023l6;

import java.util.Scanner;
import java.util.Stack;

public class L6Q4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (max 15 characters): ");
        String input = scanner.nextLine();
        
        Stack<Character> stack = new Stack<Character>();
        
        // Push each character in the string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        
        // Build a string from the characters on the stack
        String reversed = "";
        while (!stack.empty()) {
            reversed += stack.pop();
        }
        
        // Check if the reversed string is equal to the input string
        if (input.equals(reversed)) {
            System.out.println(input+" is a palindrome.");
        } else {
            System.out.println(input+" is not a palindrome.");
        }
    }
}

    
    

