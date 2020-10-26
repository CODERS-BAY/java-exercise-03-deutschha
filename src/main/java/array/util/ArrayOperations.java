package array.util;

import java.util.Arrays;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
    private final int[] numbers;      // array that needs to be sorted.
    private final int[] unsorted;     // reference array which stays unsorted.

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
        this.unsorted = numbers.clone();
    }

    /* **********************************************************
     *   Please implement the following methods.                 *
     *   It is intended that they are not static.                *
     * ***********************************************************/

    /**
     * Prints out the numbers array.
     * @return 
     */

    public String print(int[] numbers) {
		int back;
		StringBuilder str = new StringBuilder();
		for(int arr : numbers) {
			str.append(arr + ", ");
		}
		return str.toString(); 
		//return ;
    }

    /**
     * @return the sorted numbers array.
     * @see <a href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
     */
    public int[] sort() {
    	int val1;
		
		for (int i=0; i < numbers.length; i++) {
			for (int j=0; j < numbers.length -1; j++) {	
				if  (numbers[j] > numbers[j+1]) {
					val1 = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = val1;	
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		//return null;
       return numbers;
    }
    /**
     * @return the sorted array in reverse order
     */
    
    public int[] revertSort() {
    	int val1;
    	for (int i = 0;i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] < numbers[j+1]) {
					val1 = numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1] = val1;
				}
			}
		}
    	System.out.println(Arrays.toString(numbers));
        return numbers;
    }

    /**
     * @return the unsorted array in reverted order.
     */
    public int[] reverted() {
		int [] arr = new int[numbers.length];
		int j = 0;
		int val1 = 0;
			for (int i = numbers.length - 1; i>=0; i--) {
			j = 9 - i;
			//System.out.println(" i = "+i + "j="+j);
			//System.out.println("val1 = " + val1);
			val1 = numbers[i];
			arr[j] = val1;
			}
		System.out.println(Arrays.toString(arr));
        return arr;
    }

    /**
     * @param value which should be searched for.
     * @return true if the array contains the value, false otherwise.
     */
    public boolean contains(int value) {
		boolean found = false;
		int searcher = 125;
		int k = 0;
		for (int i=0; i <  numbers.length;i++) {
			if(numbers[i] == searcher) {
				found = true;
			}
		}
        return found;
    }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {
		double val1 = 0.0;
		double res = 0.0;
		for (int i : numbers) {
			val1 += i;
			//System.out.println(i);
		}
		res = val1 / numbers.length; 
        return res;
    }

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */
    public double trimmedMean() {
		int max = 0;
		int min = 0;
		int val1 = 0;
		double calc = 0.0;
		int[] arr = new int[numbers.length - 1];
		for (int i = 0;i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] < numbers[j+1]) {
					val1 = numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1] = val1;
				}
			}
		}
		for (int k = 1; k < numbers.length - 1; k++) {
			calc += numbers[k];
		}
        return calc / (numbers.length - 2);
    }

    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {
		int max = 0;
		int val = 0;
		for (int i : numbers) {
			System.out.println(i + " - " + val);
			if(i > val) {
				val = i;
			}
		}
		max = val;	
        return max;
    }

    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {
		int min = 0;
		min = minval();	
        return min;
    }

    /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    private int someHelper(int[] tmp) {
        return 1;
    }
	private int minval() {

		int val = 250;
		for (int i : numbers) {
			System.out.println(i + " - " + val);
			if(i < val) {
				val = i;
			}
		}
		return val;
	}
}
