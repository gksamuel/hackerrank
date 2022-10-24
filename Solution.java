import java.util.Scanner;
class Solution{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int items = scanner.nextInt();
		scanner.nextLine();
		String entries = scanner.nextLine();
		scanner.close();
		String[] nums = entries.split(" ");
		Long result = 0L;
		for(String s: nums){
			result = result + Long.valueOf(s);
		}
		System.out.println(result);
	}
}
