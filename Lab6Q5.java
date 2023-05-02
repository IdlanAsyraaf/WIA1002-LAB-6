/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6q5;

/**
 *
 * @author user
 */
import java.util.Stack;

public class Lab6Q5 {
    public static void main(String[] args) {
        int n = 3; // number of disks
        Stack<Integer> source = new Stack<>(); // rod 1
        Stack<Integer> auxiliary = new Stack<>(); // rod 2
        Stack<Integer> destination = new Stack<>(); // rod 3

        // fill source stack with disks
        for (int i = n; i > 0; i--) {
            source.push(i);
        }

        moveDisks(n, source, destination, auxiliary);
    }

    private static void moveDisks(int n, Stack<Integer> source, Stack<Integer> destination, Stack<Integer> auxiliary) {
        if (n == 1) {
            int disk = source.pop();
            destination.push(disk);
            System.out.println("Move disk " + disk + " from rod " + source + " to rod " + destination);
        } else {
            moveDisks(n - 1, source, auxiliary, destination);
            int disk = source.pop();
            destination.push(disk);
            System.out.println("Move disk " + disk + " from rod " + source + " to rod " + destination);
            moveDisks(n - 1, auxiliary, destination, source);
        }
    }
}

