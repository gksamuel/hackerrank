import java.util.List;
import java.util.ArrayList;
class Solution{

	public static void main(String[] args){
		List<Integer> alice = new ArrayList<Integer>();
		List<Integer> bob = new ArrayList<Integer>();
		alice.add(1);
		alice.add(5);
		alice.add(8);
		bob.add(3);
		bob.add(6);
		bob.add(1);
		List<Integer> res = compareTriplets(alice, bob);
		for(Integer i: res){
			System.out.print(i + " ");
		}
		System.out.println("");


	}

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
		int ascore = 0;
		int bscore = 0;
		for(int x = 0; x < a.size(); x++){
			if(a.get(x) > b.get(x)){
				ascore++;
			}
			if(b.get(x) > a.get(x)){
				bscore++;
			}
		}
		List<Integer> result = new ArrayList<Integer>();
		result.add(ascore);
		result.add(bscore);

		return result;

	}
}
