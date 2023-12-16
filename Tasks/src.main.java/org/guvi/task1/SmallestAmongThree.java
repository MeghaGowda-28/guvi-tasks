package org.guvi.task1;

import java.util.Scanner;

public class SmallestAmongThree {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if(num1<num2 && num1<num3){
			System.out.println("Smallest number among three : "+num1);
		} else if(num2<num3) {
			System.out.println("Smallest number among three : "+num2);
		} else {
			System.out.println("Smallest number among three : "+num3);
		}
		input.close();
	}

}
