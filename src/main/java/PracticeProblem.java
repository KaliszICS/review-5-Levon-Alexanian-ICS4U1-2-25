import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Ask the user to "Input a number: ". Output the absolute value of the number.
		Scanner scan = new Scanner(System.in); 
		System.out.print("Input a number: ");
		System.out.println(Math.abs(scan.nextDouble()));  
		
	}
	public static void q2() {
		//Ask the user to "Input a number: ". Ask the user to "Input another number: ". Divide the first number by the second number. Output the floor result of the answer on one line and the ceiling result on another.
		Scanner scan = new Scanner(System.in);  
		System.out.print("Input a number: ");
		Double num1 = scan.nextDouble();
		System.out.print("Input another number: ");
		Double num2 = scan.nextDouble();
		System.out.println(Math.floor(num1 / num2));  
		System.out.println(Math.ceil(num1 / num2));  
		
	}

	public static void q3() {
		//Ask the user to "Input a number: ". Output the square root of the number rounded.
		Scanner scan = new Scanner(System.in);  
		System.out.print("Input a number: ");
		System.out.println(Math.round(Math.sqrt(scan.nextDouble())));  
		
	}

	public static void q4() {
		//Ask the user to "Input a number: ". Ask the user to "Input another number: ". Output the result of the first number to the power of the second number.
		Scanner scan = new Scanner(System.in);  
		System.out.print("Input a number: ");
		Double num1 = scan.nextDouble();
		System.out.print("Input another number: ");
		System.out.println(Math.pow(num1, scan.nextDouble()));  
		
	}

	public static void q5() {
		//Ask the user to "Input a number: ". Ask the user to "Input another number: ". Ask the user to "Input one more number: ". Output the max and min values of the three numbers on separate lines.
		Scanner scan = new Scanner(System.in);  
		System.out.print("Input a number: ");
		Double num1 = scan.nextDouble();
		System.out.print("Input another number: ");
		Double num2 = scan.nextDouble();
		System.out.print("Input one more number: ");
		Double num3 = scan.nextDouble();
		System.out.println(Math.max(Math.max(num1, num2), num3));  
		System.out.println(Math.min(Math.min(num1, num2), num3));  
		
	}
	public static void q6() {
		//Ask the user to "Input a sentence: ". If the setence includes the word "on", output true (Even if the "on" is inside another word such as "pond"). Otherwise output false.
		Scanner scan = new Scanner(System.in);  
		System.out.print("Input a sentence: ");
		System.out.println(scan.nextLine().contains("on"));
	}
	public static void q7() {
		//Ask the user to "Input the word mango: ". Output true if they put any variation of the casing for mango. false otherwise.
		Scanner scan = new Scanner(System.in);  
		System.out.print("Input the word mango: ");
		System.out.println(scan.nextLine().equalsIgnoreCase("mango"));
		
	}
	public static void q8() {
		//Ask the user to "Input a word: ". Ask the user to "Input a letter: " Output the first index and last index of the letter in the word on seperate lines.
		Scanner scan = new Scanner(System.in);  
		System.out.print("Input a word: ");
		String word = scan.nextLine();
		System.out.print("Input a letter: ");
		String letter = scan.nextLine();
		System.out.println(word.indexOf(letter));
		System.out.println(word.lastIndexOf(letter));
		
	}

	public static void q9() {
		//Ask the user to "Input a sentence: ". Output "Your sentence is length characters long", where length is the amount of characters in their sentence.
		Scanner scan = new Scanner(System.in);  
		System.out.print("Input a sentence: ");
		System.out.println("Your sentence is "+scan.nextLine().length()+" characters long");
		
	}
	public static void q10() {
		//Ask the user to "Input a sentence: " Ask the user "Input a word to replace: ". Ask the user "What word would you like to replace it with: ". Replace all instances of the first word provided with the second word provided in the sentence.
		Scanner scan = new Scanner(System.in);  
		System.out.print("Input a sentence: ");
		String sentence = scan.nextLine();
		System.out.print("Input a word to replace: ");
		String word1 = scan.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String word2 = scan.nextLine();
		String sentence2 = sentence.replaceAll(word1, word2);
		System.out.println(sentence2);
		
	}

	public static void q11() {
		//Ask the user to "Input a sentence: " Output the sentence in all uppercase and all lowercase on seperate lines in that order. Remove any extra spaces at the beginning or end.
		Scanner scan = new Scanner(System.in);  
		System.out.print("Input a sentence: ");
		String sentence = scan.nextLine();
		System.out.println(sentence.toUpperCase().trim());
		System.out.println(sentence.toLowerCase().trim());
		
	}

	public static void q12() {
		//Ask the user to "Input a word: ". Output the first four letters and last four letters of the word on seperate lines.
		Scanner scan = new Scanner(System.in);  
		System.out.print("Input a word: ");
		String sentence = scan.nextLine();
		System.out.println(sentence.substring(0, 4));
		System.out.println(sentence.substring(sentence.length()-4,sentence.length()));
	}
	

}
