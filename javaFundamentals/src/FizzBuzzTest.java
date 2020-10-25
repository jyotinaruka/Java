public class FizzBuzzTest {

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();

		String fbTest_3 = fb.fizzBuzz(3);
		System.out.println(fbTest_3);
		String fbTest_5 = fb.fizzBuzz(5);
		System.out.println(fbTest_5);
		String fbTest_15 = fb.fizzBuzz(15);
		System.out.println(fbTest_15);
		String fbTest_2 = fb.fizzBuzz(2);
		System.out.println(fbTest_2);
	}
}
