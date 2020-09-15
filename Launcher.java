import java.util.*;

public class Launcher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input string: ");
		String inputString = sc.nextLine(); 

		Solution sol = new Solution();
		char firstNonRepeatingChar = sol.firstNonRepeatingCharacter(inputString);

		System.out.println("The first non-repeating char is " + firstNonRepeatingChar);
		
	}	
}

