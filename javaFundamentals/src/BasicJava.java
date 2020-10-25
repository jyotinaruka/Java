import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {

  public static void main(String[] args) {
    // Print 1-255
    for (int i = 1; i <= 255; i++) {
      System.out.println(i);
    }
    // Print odd numbers between 1-255
    for (int i = 1; i <= 255; i += 2) {
      System.out.println(i);
    }
    //Print Sum
    for (int i = 1; i <= 255; i++) {
      System.out.println("New number:" + i);
      System.out.println("Sum:" + i);
    }
    //Iterating through an array,Given an array X, say [1,3,5,7,9,13]
    int[] arr = new int[] { 1, 3, 5, 7, 9, 13 };
    for (int i = 0; i < arr.length; i++) {
      int x = arr[i];
      System.out.println(x + ",");
    }
    // max
    int[] arr1 = new int[] { 2, 8, -3, -5, -7 };
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr1.length; i++) {
      if (max < arr1[i]) {
        max = arr1[i];
      }
    }
    System.out.println(max);

    /* Get Average
      Write a method that takes an array, and prints the AVERAGE of the values in the array. 
      For example for an array [2, 10, 3], your method should print an average of 5. Again, 
      make sure you come up with a simple base case and write instructions to solve that base 
      case first, then test your instructions for other complicated cases. */
    int[] arr2 = new int[] { 2, 10, 3 };
    int avg = 0;
    int sum = 0;
    for (int i = 0; i < arr2.length; i++) {
      sum += arr2[i];
    }
    if (sum == 0) {
      avg = 0;
    } else {
      avg = sum / arr2.length;
    }
    System.out.println(avg);

    //Array with Odd Numbers
    ArrayList<Integer> y = arrayWithOddNumbers();
    System.out.println(y);

    // Greater Than Y
    int[] arr3 = new int[] { 1, 3, 5, 7 };
    int count = greaterThanY(arr3, 3);
    System.out.println(count);

    //Square the values
    int[] arr4 = new int[] { 1, 5, 10, -2 };
    squareTheValues(arr4);
    System.out.println(Arrays.toString(arr4));

    //Eliminate Negative Numbers
    int[] arr5 = new int[] { 1, 5, 10, -2 };
    eliminateNegativeNumbers(arr5);
    System.out.println(Arrays.toString(arr5));

    //Max, Min, and Average
    int[] arr6 = new int[] { 1, 5, 10, -2 };
    int[] x = maxMinAverage(arr6);
    System.out.println(Arrays.toString(x));
  }

  /* Array with Odd Numbers
    Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255.
    When the method is done,'y' should have the value of [1, 3, 5, 7, ... 255]. */
  public static ArrayList<Integer> arrayWithOddNumbers() {
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int i = 1; i <= 255; i += 2) {
      y.add(i);
    }
    return y;
  }

  /* Greater Than Y
    Write a method that takes an array and returns the number of values in that array 
    whose value is greater than a given value y. 
    For example, if array = [1, 3, 5, 7] and y = 3,
    after your method is run it will print 2 
    (since there are two values in the array that are greater than 3). */

  public static int greaterThanY(int[] arr, int y) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > y) {
        count++;
      }
    }
    return count;
  }

  /* Square the values
Given any array x, say [1, 5, 10, -2], 
write a method that multiplies each value in the array by itself. 
When the method is done, the array x should have values that have been squared, 
say [1, 25, 100, 4]. */
  public static void squareTheValues(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] * arr[i];
    }
  }

  /* Eliminate Negative Numbers
Given any array x, say [1, 5, 10, -2], 
write a method that replaces any negative number with the value of 0.
When the method is done, x should have no negative values, say [1, 5, 10, 0].*/
  public static void eliminateNegativeNumbers(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        arr[i] = 0;
      }
    }
  }

  /* Max, Min, and Average
  Given any array x, say [1, 5, 10, -2],
  write a method that returns an array with the maximum number in the array,
  the minimum value in the array, and the average of the values in the array.
  The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG] */
  public static int[] maxMinAverage(int[] arr) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int sum = 0;
    int avg = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
      sum += arr[i];
    }
    if (sum == 0) {
      avg = 0;
    } else {
      avg = sum / arr.length;
    }
    return new int[] { max, min, avg };
  }
}
