package org.guvi.task4.quest5;

import java.util.Stack;

public class StackApp {
	
	public static void main(String[] args) throws Exception {
		
		Stack<Integer> stack = new Stack<>();
	
		pushIntoStack(stack, 12);
		pushIntoStack(stack, 21);
		pushIntoStack(stack, 28);
		
		popOutOfStack(stack);
		isStackEmpty(stack);
		
		System.out.println(stack);
	}

	private static void isStackEmpty(Stack<Integer> stack) {
		System.out.println(stack.empty());
	}

	private static void popOutOfStack(Stack<Integer> stack) throws Exception {
		if(!stack.empty()){
			stack.pop();
		} else{
			throw new Exception("Stack is empty to perform pop operation");
		}
	}

	private static void pushIntoStack(Stack<Integer> stack, int age) {
		stack.add(age);
	}

}
