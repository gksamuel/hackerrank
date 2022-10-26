import java.util.List;
import java.util.ArrayList;
class Solution{
	public static void main(String[] args){
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		List<Integer> b = new ArrayList<Integer>();
		b.add(4);
		b.add(5);
		b.add(6);
		List<Integer> c = new ArrayList<Integer>();
		c.add(9);
		c.add(8);
		c.add(9);

		List<List<Integer>> input = new ArrayList<List<Integer>>();
		input.add(a);
		input.add(b);
		input.add(c);
		int result = diagonalDifference(input);
		System.out.println(result);


	}

	public static int diagonalDifference(List<List<Integer>> arr){
		int ltrSum = 0;
		int rtlSum = 0;
		int ltrPos = 0;
		int rtlPos = arr.size() - 1;
		for(List<Integer> row: arr){
			ltrSum = ltrSum + row.get(ltrPos);
			rtlSum = rtlSum + row.get(rtlPos);
			ltrPos++;
			rtlPos--;
		}
		return Math.abs(ltrSum - rtlSum);
	}
}
