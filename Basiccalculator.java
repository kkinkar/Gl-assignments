package calculator;

import java.util.Scanner;

public class Basiccalculator {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the first number ");
			int num1 = in.nextInt();
			System.out.println("Enter the second number ");
			int num2 = in.nextInt();
			System.out.println("Enter the options from the following");
			System.out.println("1.addition ");
			System.out.println("2.subtraction ");
			System.out.println("3.multiply");
			System.out.println("4.Divide");
			int option = in.nextInt();
			switch (option) {
			case 1:
				System.out.println(num1 + num2);
				break;
			case 2:
				System.out.println(num1 - num2);
				break;
			case 3:
				System.out.println(num1 * num2);
				break;
			case 4:
				if (num2 == 0) {
					System.out.println("number cannot be divided");
				}
				else {
				System.out.println(num1 / num2);
				
				}
				break;
			}
		}
		
		

	}

}
