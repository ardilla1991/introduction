package by.htp.task1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//task1();
		//task2();
		//task3And4();
		//task5();
		//task6();
		//task7();
		//task8();
		//task9();
		//task10();
		//task11();
		//task12();
		task13();
		//task14();
	}
	
	private static void task1()
	{
		System.out.println("*********** task 1 ********************");
		System.out.println("Zubareva");
		System.out.println("Yuliana");
		System.out.println("Anatolievna");
	}
	
	private static void task2()
	{
		System.out.println("*********** task 2 ********************");
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println("Sum a+b=" + c);
	}
	
	private static void task3And4()
	{
		System.out.println("*********** tasks 3 and 4********************");

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a1 = in.nextInt();
		
		System.out.print("Enter the second number: ");
		int b1 = in.nextInt();
		
		Scanner in1 = new Scanner(System.in);

		System.out.print("Enter an operator: ");
		String operation = in1.nextLine();
		
		double res = 0;
		
		if ( operation.equals("+") ) {
			res = a1 + b1;
		} else if ( operation.equals("-") ) {
			res = a1 - b1;
		} else if ( operation.equals("/") ) {
			res = a1 / b1;
		} else if ( operation.equals("*") ) {
			res = a1 * b1;
		}
		
		System.out.println("Result of action with if:" + res);
		
		switch (operation) {
			case "+" :
				res = a1 + b1;
				break;
			case "-":
				res = a1 - b1;
				break;
			case "/":
				res = a1 / b1;
				break;
			case "*":
				res = a1 * b1;
				break;
	
			default:
		}
		
		System.out.println("Result of action with switch:" + res);
	}
	
	private static void task5()
	{
		System.out.println("*********** task 5 ********************");

		Scanner inNumber = new Scanner(System.in);
		System.out.print("Please, enter a number: ");
		int number = inNumber.nextInt();

		String nameOfNumber = "";
		
		switch (number) {
			case 0 :
				nameOfNumber = "nul";
				break;
			case 1 :
				nameOfNumber = "one";
				break;
			case 2:
				nameOfNumber = "two";
				break;
			case 3:
				nameOfNumber = "three";
				break;
			case 4:
				nameOfNumber = "four";
				break;
			case 5:
				nameOfNumber = "five";
				break;
			case 6:
				nameOfNumber = "six";
				break;
			case 7:
				nameOfNumber = "seven";
				break;
			case 8:
				nameOfNumber = "eight";
				break;
			case 9:
				nameOfNumber = "nine";
				break;
			default:
				nameOfNumber = "undefined number";
		}
		System.out.println("Name of number: " + nameOfNumber);
	}	

	private static void task6()
	{
		System.out.println("*********** task 6 ********************");
		
		Scanner inNumber = new Scanner(System.in);
		System.out.print("Please, enter a number [0;9]: ");
		int number = 0;
		
		if ( inNumber.hasNextInt() ) {
			do {
				number = inNumber.nextInt();
				if ( !(number >=0 && number <= 9) )
					System.out.print("Error! Please, enter a number [0;9]: ");
			}
			while ( !(number >=0 && number <= 9) );
		}

		if ( number % 2 == 0 )
			System.out.println("Name " + number + " is even: ");
		else
			System.out.println("Name " + number + " is odd: " );
	}
	
	private static void task7()
	{
		System.out.println("*********** task 7 ********************");
		
		Scanner inNumber = new Scanner(System.in);
		System.out.print("Please, enter a number [-9;9]: ");
		int number = 0;
		
		if ( inNumber.hasNextInt() ) {
			do {
				number = inNumber.nextInt();
				if ( !(number >=-9 && number <= 9) )
					System.out.print("Error! Please, enter a number [-9;9]: ");
			}
			while ( !(number >=-9 && number <= 9) );
		}

		if ( number > 0 && number % 2 == 0 )
			System.out.println("Name " + number + " is even and positive: ");
		else
			System.out.println("Name " + number + " is odd or negative " );
	}
	
	private static void task8()
	{
		System.out.println("*********** task 8 ********************");
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a name of month: ");
		String monthName = in.nextLine();
		
		switch ( monthName ) {
			case "December":
			case "January":
			case "February":
				System.out.println("This is winter");
				break;
			case "March":
			case "April":
			case "May":
				System.out.println("This is spring");
				break;
			case "June":
			case "July":
			case "August":
				System.out.println("This is summer");
				break;
			case "September":
			case "October":
			case "November":
				System.out.println("This is autumn");
				break;	
			default:
				System.out.println("Undefined name");
		}
	}
	
	private static void task9()
	{
		System.out.println("*********** task 9 ********************");
		
		int sum = 0;
		for (int i=0; i<100; i++) {
			sum += i;
		}
		
		System.out.println("Sum of numbers is " + sum);
	}

	private static void task10()
	{
		System.out.println("*********** task 10 ********************");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a1 = in.nextInt();
		System.out.print("Enter the second number: ");
		int a2 = in.nextInt();
		System.out.print("Enter the third number: ");
		int a3 = in.nextInt();
		
		int min = Math.min(a1, Math.min(a2, a3));
		int max = Math.max(a1, Math.max(a2, a3));
		
		System.out.println("Min + Max: " + (min + max));
	}

	private static void task11()
	{
		System.out.println("*********** task 11 ********************");
		
		Scanner inString = new Scanner(System.in);
		System.out.print("Please, enter a symbol: ");
		String symbol;
		
		if ( inString.hasNext() ) {
			do {
				symbol = inString.nextLine();
				if ( !(symbol.equals("q") ) )
					System.out.print("Enter another symbol: ");
			}
			while ( !(symbol.equals("q") ) );
		}
	}
	
	private static void task12()
	{
		System.out.println("*********** task 12 ********************");
		
		Scanner inString = new Scanner(System.in);
		System.out.print("Please, enter a text: ");
		String symbol;
		
		if ( inString.hasNext() ) {
			do {
				symbol = inString.nextLine();
				if ( !(symbol.equals("stop") ) )
					System.out.print("Enter another text: ");
			}
			while ( !(symbol.equals("stop") ) );
		}
	}

	private static void task13()
	{
		System.out.println("*********** task 13 ********************");
		
		int cols = 5;
		int rows = 5;
		int arr[][] = new int[rows][cols];
		
		for (int i=0; i<rows;i++) {
			for (int j=0; j<cols; j++) {
				arr[i][j] = (int) (Math.random()*10);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int max = Integer.MIN_VALUE;
		int max_r = 0;
		int max_c = 0;
		
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				if ( max < arr[i][j] ) {
					max = arr[i][j];
				}
			}
		}
		
		System.out.println(max);
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if ( max == arr[i][j] ) {
					arr = deleteRowAndCol(i,j, arr);
				}
			}
		}
		
	}
	
	private static int[][] deleteRowAndCol(int rowDel, int colDel, int[][] arr) {
		
		for ( int i = rowDel; i < arr.length - 1; i++ ) {
			for ( int j = 0; j < arr[0].length; j++ ) {
				arr[i][j] = arr[i+1][j];
			}
		}
		
		for ( int j = colDel; j < arr[0].length - 1; j++ ) {
			for ( int k = 0; k < arr[0].length; k++ ) {
				arr[k][j] = arr[k][j+1];
			}
		}
		
		
		for ( int k = 0; k < arr.length; k++ ) {
			for ( int f = 0; f < arr[0].length; f++ ) {
				System.out.print(arr[k][f] + " ");
			}
			System.out.println();
		}
		System.out.println("next");
		return arr;
	}

	private static void task14()
	{
		System.out.println("*********** task 14 ********************");
		
		Scanner inInt = new Scanner(System.in);
		System.out.print("Please, enter cols number ");
		int cols = inInt.nextInt();
		System.out.print("Please, enter rows number: ");
		int rows = inInt.nextInt();
		int arr[][] = new int[rows][cols];
		int sum = 0;
		int value = 0;
		
		for (int i=0; i<rows;i++) {
			for (int j=0; j<cols; j++) {
				System.out.print("Please, enter value of element [" + i + ";" + j + "]: ");
				value = inInt.nextInt();
				arr[i][j] = value;
				if ( i == j )
					sum += value;
			}
		}
		
		System.out.print("Sum is: " + sum);
		
	}
	
}


