import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Puzzling {

	/*
	 * Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the
	 * sum of all numbers in the array. Also have the function return an array that
	 * only includes numbers that are greater than 10 (e.g. when you pass the array
	 * above, it should return an array with the values of 13,25,32)
	 */
	public ArrayList<Integer> sumAndGreaterThan10(int[] arr) {
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] > 10) {
				newArray.add(arr[i]);
			}
		}
		System.out.println(sum);
		return newArray;
	}

	/*
	 * Create an array with the following values: Nancy, Jinichi, Fujibayashi,
	 * Momochi, Ishikawa. Shuffle the array and print the name of each person. Have
	 * the method also return an array with names that are longer than 5 characters.
	 */
	public ArrayList<String> shuffleStrings(String[] arr) {
		ArrayList<String> newList = new ArrayList<String>();
		ArrayList<String> newList5 = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 5) {
				newList5.add(arr[i]);
			}
			newList.add(arr[i]);
		}
		Collections.shuffle(newList);
		System.out.println(newList);

		return newList5;
	}

	/*
	 * Create an array that contains all 26 letters of the alphabet (this array must
	 * have 26 values). Shuffle the array and after shuffling, display the last
	 * letter from the array. Have it also display the first letter of the array. If
	 * the first letter in the array is a vowel, have it display a message. To
	 * shuffle a collection, you can use the shuffle method of the Collections
	 * class.
	 */

	public void shuffleAlphabet() {
		ArrayList<String> alphaArr = new ArrayList<String>();
		for (char alpha = 'A'; alpha <= 'Z'; alpha++) {
			alphaArr.add(Character.toString(alpha));
		}
		System.out.println(alphaArr);
		Collections.shuffle(alphaArr);
		System.out.println(alphaArr);

		System.out.println("First letter of shuffled array: " + alphaArr.get(0));
		System.out.println("Last letter of shuffled array: " + alphaArr.get(25));
		String sample = alphaArr.get(0);

		if ("AEIOU".indexOf(sample) > 0) {
			System.out.println("The first letter happens to be a vowel!");
		}
	}

	/*
	 * Generate and return an array with 10 random numbers between 55-100. To get a
	 * random integer, you can use the nextInt method of the Random class.
	 */

	public ArrayList<Integer> randNumber() {
		ArrayList<Integer> randNums = new ArrayList<Integer>();
		Random r = new Random();
		int low = 55;
		int high = 101;
		for (int i = 0; i < 10; i++) {
			int num = r.nextInt(high - low) + low;
			randNums.add(num);
		}
		return randNums;

	}

	/*
	 * Generate and return an array with 10 random numbers between 55-100 and have
	 * it be sorted (showing the smallest number in the beginning). Display all the
	 * numbers in the array. Next, display the minimum value in the array as well as
	 * the maximum value. To sort a collection, you can use the sort method of the
	 * Collections class.
	 */
	public ArrayList<Integer> randNumber2() {
		ArrayList<Integer> randNums2 = new ArrayList<Integer>();
		int min = 101;
		int max = 55;
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int num2 = r.nextInt(101 - 55) + 55;
			randNums2.add(num2);
			if (num2 < min) {
				min = num2;
			}
			if (num2 > max) {
				max = num2;
			}
		}
		Collections.sort(randNums2);

		System.out.println("Smallest randomized number is: " + min);
		System.out.println("Largest randomized number is: " + max);
		return randNums2;
	}

	/* Create a random string that is 5 characters long. */
	public void randomString() {
		Random rand = new Random();
		StringBuilder randString = new StringBuilder();
		String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < 5; i++) {
			randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
		}
		String finalString = randString.toString();
		System.out.println(finalString);
	}

	/* Generate an array with 10 random strings that are each 5 characters long */
	public ArrayList<String> randomStringOfStrings() {
		Random rand = new Random();
		StringBuilder randString = new StringBuilder();
		ArrayList<String> randList = new ArrayList<String>();
		String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
			}
			String finalString = randString.toString();
			randList.add(finalString);
			randString.setLength(0);
		}
		return randList;
	}
}
