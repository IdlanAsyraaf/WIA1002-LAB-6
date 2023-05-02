package pkg2023l6;

import java.util.Random;
import java.util.Stack;

public class L6Q1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            stack.push(random.nextInt(101));
        }
        System.out.println(stack);
        System.out.println("Sum is: " + sum(stack));
    }

    public static int sum(Stack<Integer> stack) {
        int sum = 0;
        while(!stack.isEmpty()) 
            sum += stack.pop();
        return sum;
	}
    }
    
