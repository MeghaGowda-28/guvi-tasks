package org.guvi.task1;

import java.util.Scanner;

public class Pattern {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		
		for(int i=count; i>0; i--){
			for(int j=count; j>0; j--){
				System.out.print(i);
			}
			System.out.println();
		}

		input.close();
	}
	
}
