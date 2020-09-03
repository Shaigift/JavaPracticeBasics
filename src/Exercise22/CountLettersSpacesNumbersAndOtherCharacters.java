package Exercise22;

import java.util.Scanner;

public class CountLettersSpacesNumbersAndOtherCharacters {	
	public static void main(String[] args) {
		Scanner word = new Scanner(System.in);
		System.out.print("Please give words: ");
		String test = word.nextLine();
		count(test);
		
	}


	public static void count(String word) {
		char[] ch = word.toCharArray();
		int letters = 0;
		int space = 0;
		int number = 0;
		int other = 0;
		for(int i = 0; i < word.length(); i++) {
			if(Character.isLetter(ch[i])){
				letters ++ ;
			}
			else if(Character.isDigit(ch[i])){
				number ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("letter: " + letters);
		System.out.println("space: " + space);
		System.out.println("number: " + number);
		System.out.println("other: " + other);
	}
	
}

	
		
		
		

		
