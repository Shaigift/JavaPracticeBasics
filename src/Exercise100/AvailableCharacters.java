package Exercise100;

import java.nio.charset.Charset;
import java.util.Scanner;

public class AvailableCharacters {
		public static void main(String[] args) {
			System.out.println("List of available character sets: ");  
		    for (String str : Charset.availableCharsets().keySet()) {
		      System.out.println(str);
		    }
		  }
		}
