import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Matcher;
import java.util.Scanner;

class Solution{
	public static void main(String[] args){
//		String regex = "^[0-9]{1}\\."; // 1 digit
//		String regex = "[0-9]{2}\\."; // 2 digits
//		String regex = "1[0-9]{2}\\."; // 100 to 199
//		String regex = "2[0-4][0-9]\\."; // 200 to 249
//		String regex = "25[0-5]\\."; // 200 to 249

		String regex = "^[0-9]{1}\\.|[0-9]{2}\\.|1[0-9]{2}\\.|2[0-4][0-9]\\|25[0-5]\\."; // 200 to 249








		String regex = "33|44"; // test

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		try{
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			if(matcher.find()){
				System.out.println("We found a match!!");
			}
			else{
				System.out.println("No match found!!");
			}
		}
		catch(PatternSyntaxException pse){
			System.out.println("Regex not valid");
		}

	}

}
