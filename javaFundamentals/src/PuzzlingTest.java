import java.util.ArrayList;

public class PuzzlingTest {

	public static void main(String[] args) {
		Puzzling testData = new Puzzling();

		int[] testArr = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
		ArrayList<Integer> newArr = testData.sumAndGreaterThan10(testArr);
		System.out.println(newArr);

		String[] testList = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa", };
		ArrayList<String> name5 = testData.shuffleStrings(testList);
		System.out.println(name5);

		testData.shuffleAlphabet();

		ArrayList<Integer> randNums = testData.randNumber();
		System.out.println(randNums);

		ArrayList<Integer> randNums2 = testData.randNumber2();
		System.out.println(randNums2);

		testData.randomString();

		ArrayList<String> randList = testData.randomStringOfStrings();
		System.out.println(randList);
	}
}
