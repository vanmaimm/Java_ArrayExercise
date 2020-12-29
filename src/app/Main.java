package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void showArray(int[] array) {
//		for(int i=0;i<array.length;i++) {
//			System.out.print(array[i]+"\t");
//		}
		System.out.println(Arrays.toString(array));
	}

	// Descending order array
	public static int[] descendingOrder(int[] array) {
		int temp = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

	// Ascending order array
	public static int[] ascendingOrder(int[] array) {
		int temp = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

	// delete
	public static int[] delete(int[] array, int index) {
		int[] newArray = new int[array.length - 1];
		for (int i = 0, temp = 0; i < array.length; i++) {
			if (i == index - 1) {
				continue;
			}
			newArray[temp++] = array[i];
		}
		return newArray;
	}

	// Insert
	public static int[] insert(int[] array, int location, int value) {
		 array = Arrays.copyOf(array, array.length + 1);
		for (int i=array.length-1;i<0;i--) {
			if(i>=location) {
				array[i]=array[i-1];
			}else if(i==location-1) {
				array[i]=value;
			}else break;
		}
		return array;
	};

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array");
		int n = input.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
//
//		System.out.print("Input deleting location");
//		int index = input.nextInt();
//		System.out.print("Value of array after delete a element");
//		showArray(delete(array, index));

		System.out.print("Input inserting location!");
		int location = input.nextInt();
		System.out.print("Input a value!");
		int value = input.nextInt();
		System.out.print("Value of array after insert a element");
		showArray(insert(array, location, value));
//		
//		System.out.print("Value of array after descending order");
//		int[] sortDes = descendingOrder(array);
//		showArray(sortDes);
//
//		System.out.print("Value of array after ascending order");
//		int[] sortAsc = ascendingOrder(array);
//		showArray(sortAsc);


	}
}
