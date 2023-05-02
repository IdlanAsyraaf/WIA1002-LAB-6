/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsl6;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 *
 * @author Addin Suhaimi
 */
public class MyStack<E> {
    private ArrayList<E> stack;
	
	public MyStack() {
		stack = new ArrayList<E>();
	}
	
	public void push(E element) {
		stack.add(element);
	}
	
	public E pop() {
		if(isEmpty())
			throw new EmptyStackException();
		return stack.remove(stack.size() - 1);
	}
	
	public E peek() {
		if(isEmpty())
			throw new EmptyStackException();
		return stack.get(stack.size() - 1);
	}
	
	public int getSize() {
		return stack.size();
	}
	
	public boolean isEmpty() {
		return stack.size() == 0;
	}
	
	@Override
	public String toString() {
		return stack.toString();
	}
	
	public boolean search(E element) {
		return stack.contains(element);
	}
}
