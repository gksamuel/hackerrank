import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class Solution{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int entries = scanner.nextInt();
		scanner.nextLine();
		List<String> patterns = new ArrayList<String>();
		for(int x = 0; x < entries; x++){
			patterns.add(scanner.nextLine());
		}
		scanner.close();
		for(String s : patterns){
			try{
				Pattern pattern = Pattern.compile(s);
				System.out.println("Valid");

			}
			catch(PatternSyntaxException pse){
				System.out.println("Invalid");

			}


		}



	}
}
